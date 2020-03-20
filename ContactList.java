
public class ContactList {
	static String name;
	static String phoneNumber;
	static String address;
	static String email;

	public ContactList(String name, String phoneNumber, String email, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	public String toString() {
		return name + " " + phoneNumber + " " + " " + address;
	}

	public static String getName() {
		return name;
	}

	public static String getPhoneNumber() {
		return phoneNumber;
	}

	public static String getAddress() {
		return address;
	}

	public static String getEmail() {
		return email;
	}

	public static void setName(String name1) {
		name = name1;
	}

	public static void setAddress(String addr) {
		address = addr;
	}

	public static void setNumber(String number) {
		phoneNumber = number;
	}

	public static void setEmail(String email1) {
		email = email1;
	}

	public static void printActions() {
		System.out.println("Available Actions\n");
		System.out.println(
				" press 1. To Display all the contacts \n Press 2. To Create a new Contact \n Press 3. To Delete Contact \n Press 4. Search for a Contact");
	}

	public static ContactList createContact(String name, String phoneNumber, String email, String address) {
		// TODO Auto-generated method stub
		return new ContactList(name, phoneNumber, email, address);
	}
}