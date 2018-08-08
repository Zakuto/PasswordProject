import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanFileInputTutorial {
	public static void main(String[] args){
		
//		File file = new File("D:/testcode.txt");
//		Scanner scannerFile = new Scanner(file);
//		try {
//			openFile();
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			System.out.println("File is missing or not exist");
//		}
		
		int words =0;
//		while(scannerFile.hasNextLine()) {
//			String line = scannerFile.nextLine();
//			words = line.split(" ").length;
//		}
		
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		System.out.print("Insert number of months: ");
		Scanner scanner = new Scanner(System.in);
		try {
			int month = scanner.nextInt();
			System.out.print(months[month]);
		} catch (IndexOutOfBoundsException exception) {
			System.out.print("Index is out of bounds");
		} catch (InputMismatchException exception) {
			System.out.print("Input mismatch");
}
		
		
//		System.out.println("the file contains " + words + " words.");
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("testing.txt");
		}
	
}
