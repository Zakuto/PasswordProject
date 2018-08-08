import java.util.Scanner;

public class ScanInputTutorial {
public static void main(String[] args) {
	Scanner scanner  = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);
	System.out.print("Please enter your address: ");
	String address = scanner.nextLine();
	System.out.print("Please enter your grade: ");
	int grade = scanner2.nextInt();
	System.out.println("Your address is " + address);
	
	if (grade > 80) {
		System.out.println("You got "+ grade +" marks and you did well");
	}else {
		System.out.println(grade + " ? Try again next time bro....");
	}
	
}
}
