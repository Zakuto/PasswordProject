import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	Game tetris = new Game();
	
	public static String date = LocalDate.parse("2018-09-22").format(DateTimeFormatter.ISO_DATE);
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(date);
		String date2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
		System.out.println(date2);
		Game game2 = null;// this object indicates it is invalid or yet to be set...
		
		ContactManager contactManager = new ContactManager();
		
		Contact sarah =new Contact();
		Contact bisco = new Contact();
		
		sarah.name = "Sarah";
		sarah.phoneNumber ="0128546758";
		bisco.name = "Bisco";
		bisco.phoneNumber = "01388458586";
		
		contactManager.addContacts(sarah);
		contactManager.addContacts(bisco);
		
		
		Contact result = contactManager.searchContact("Bisco");
		
		System.out.println(result.phoneNumber);
		
		
		
	}
}

