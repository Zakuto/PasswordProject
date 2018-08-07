import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class PasswordUtils {
	private static final Random RANDOM = new SecureRandom();
	private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final int ITERATIONS = 10000;
	private static final int KEY_LENGTH = 256;
	private static final String ALGO = "AES";
	private byte [] keyValue;
	
	public PasswordUtils (String key) {
		keyValue = key.getBytes();
	}
	
	public static String getSalt(int length) {
		StringBuilder returnValue = new StringBuilder(length);
		
		for (int i=0;i<length;i++) {
			returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
		}
		
		return new String(returnValue);
	}
	
	public static byte[] hash(char[] password, byte[] salt) {
	
		PBEKeySpec spec = new PBEKeySpec(password,salt,ITERATIONS,KEY_LENGTH);
		try {
			SecretKeyFactory sKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			
			SecretKey tmp = sKeyFactory.generateSecret(spec);
			SecretKeySpec sKey = new SecretKeySpec(tmp.getEncoded(), ALGO);
			return sKey.getEncoded();
			
		} catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
	         throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
			
		}finally {
			spec.clearPassword();
		}
		
	}
	
	public static String generateSecurePassword(String password, String salt) {
	    String returnValue = null;
	    byte[] securePassword = hash(password.toCharArray(), salt.getBytes());

	    returnValue = Base64.getEncoder().encodeToString(securePassword);

	    return returnValue;
	}
	
	public static boolean verifyUserPassword(String providedPassword,
	        String securedPassword, String salt)
	{
	    boolean returnValue = false;
	    
	    // Generate New secure password with the same salt
	    String newSecurePassword = generateSecurePassword(providedPassword, salt);
	    
	    // Check if two passwords are equal
	    returnValue = newSecurePassword.equalsIgnoreCase(securedPassword);
	    
	    return returnValue;
	}
	
	

}
