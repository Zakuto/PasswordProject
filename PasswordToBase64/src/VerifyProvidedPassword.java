import java.util.Scanner;

public class VerifyProvidedPassword {
	  public static void main(String[] args)
	    {
		  System.out.print("Enter your password: ");
			 Scanner scanner = new Scanner(System.in);
	        // User provided password to validate
	        String providedPassword = scanner.nextLine();
	                
	        // Encrypted and Base64 encoded password read from database
	        String securePassword = "sWsmKxm7ZHEZeUMTNzaarI36ASVOeg9Ub8tavK3pnMo=";
	        
	        // Salt value stored in database 
	        String salt = "Cjqwu0cL2uwvaXy4Jqtcc2Rahm3l6Z";
	        
	        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
	        
	        if(passwordMatch) 
	        {
	            System.out.println("Provided user password " + providedPassword + " is correct.");
	        } else {
	            System.out.println("Provided password is incorrect");
	        }
	    }
}
