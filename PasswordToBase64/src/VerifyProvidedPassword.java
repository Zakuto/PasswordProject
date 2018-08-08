import java.util.Scanner;

public class VerifyProvidedPassword {
	  public static void main(String[] args)
	    {
		  System.out.print("Enter your password: ");
			 Scanner scanner = new Scanner(System.in);
	        // User provided password to validate
	        String providedPassword = scanner.nextLine();
	                
	        // Encrypted and Base64 encoded password read from database
	        String securePassword = "jLqAf7zGaoi150mkUr5A23L4Izy0ZsJSSRkAZJEAiMA=";
	        
	        // Salt value stored in database 
	        String salt = "p4NMi8v5r8loc5Eb3t6Z7GnGtGlO4f";
	        
	        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
	        
	        if(passwordMatch) 
	        {
	            System.out.println("Provided user password " + providedPassword + " is correct.");
	        } else {
	            System.out.println("Provided password is incorrect");
	        }
	    }
}
