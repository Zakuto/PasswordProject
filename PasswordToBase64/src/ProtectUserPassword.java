import java.util.Scanner;

public class ProtectUserPassword {
	 public static void main(String[] args)
	    {
		 
		 System.out.print("Enter your password: ");
		 Scanner scanner = new Scanner(System.in);
		 	
	        String myPassword = scanner.nextLine();
	        //String myPassword = "aryanto8740";
	        // Generate Salt. The generated value can be stored in DB. 
	        String salt = PasswordUtils.getSalt(30);
	        
	        // Protect user's password. The generated value can be stored in DB.
	        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);
	        
	        // Print out protected password 
	        //dBkJxnkR1IJHvv7iiTYwBnCEyhDIDnvMkq/2Xtsu+uc=
	        //salt 6B4Fkl8sYISUbunGH5QPMuFXVfrm4Q
	        System.out.println("My secure password = " + mySecurePassword);
	        System.out.println("Salt value = " + salt);
	    }
}
