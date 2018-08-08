
public class ContactManager {

	Contact [] friends;
	int friendsCount;
	
	public ContactManager() {
		this.friendsCount = 0;
		this.friends = new Contact[500];
	}
	
	void addContacts(Contact contact) {
		friends[friendsCount] = contact;
		friendsCount++;
	};
	
	Contact searchContact(String searchName) {
		for(int i=0;i<friendsCount;i++) {
			if(friends[i].name.equals(searchName)) {
				return friends[i];
			}
		}
		return null;
	}
	
	
}
