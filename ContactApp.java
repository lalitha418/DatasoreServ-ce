import java.util.Scanner;
import java.util.HashMap;
import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactApp {
	static HashMap<String, Class> num = new HashMap<String, Class>();
	static Scanner scan = new Scanner(System.in);
	static HashMap<String, ContactList> hash = new HashMap<String, ContactList>();
	static HashMap<String, String> hash1 = new HashMap<String, String>();
	static HashMap<String, Phone> hash2 = new HashMap<String, Phone>();
	
	String name;
	String phoneNumber;
	String email;
	String address;

	public static void printActions() {
		System.out.println("Available Actions\n");
		System.out.println(
				" press 1. To Create a new Contact \n Press 2. To Delete a Contact \n Press 3. To List the Contacts \n Press 4. To Search for a Contact \n Press 5. To update a contact \n Press 6. Quit");
		System.out.println("press number , which action to be performed");

		// System.out.println("enter a number:");
	}

	public static void addNewContact() {
		System.out.println("Enter name:");
		String name = scan.next();
		scan.nextLine();
		boolean check = checkName(name);
		if (check == false) {
			boolean cn;
			do {
				System.out.println("enter valid name");
				name = scan.next();
				cn = checkName(name);
			} while (cn == false);
		}

		System.out.println("Enter PhoneNumber:");
		String phoneNumber = scan.next();
		boolean check1 = checkNum(phoneNumber);
		if (check1 == false) {
			boolean cn;
			do {
				System.out.println("enter valid Phonenumber");
				phoneNumber = scan.next();
				cn = checkNum(phoneNumber);
			} while (cn == false);
		}
		System.out.println("Do you want to add another number:");
		String num = scan.next();
		boolean checkin = checkNum(phoneNumber);
		if (checkin == false) {
			boolean cn;
			do {
				System.out.println("enter valid Phonenumber");
				phoneNumber = scan.next();
				cn = checkNum(phoneNumber);
			} while (cn == false);
		}

		System.out.println("Enter email:");
		String email = scan.next();
		boolean check2 = checkMail(email);
		if (check2 == false) {
			boolean cm;
			do {
				System.out.println("enter valid email");
				email = scan.next();
				cm = checkMail(email);
			} while (cm == false);
		}

		System.out.println("Enter address:");
		String address = scan.next();

		ContactList newContact = ContactList.createContact(name, phoneNumber, email, address);
		hash.put(email, newContact);
		System.out.println("Contact added Succcesfuuly");
		System.out.println(hash);
	}

	public static void DeleteContact() {
		System.out.println(hash);
		System.out.println("enter specific key to delete");
		String obj = scan.next();
		hash.remove(obj);
		System.out.println("contact deleted ..!");
		System.out.println(hash);
	}

	public static void ShowContacts() {
		System.out.println("Contact List::");
		System.out.println(hash);
	}

	public static void SearchContact() {
		String name = ContactList.getName();
		String phoneNumber = ContactList.getPhoneNumber();
		String email = ContactList.getEmail();
		String address = ContactList.getAddress();
		System.out.println(hash);
		System.out.println("enter specific key to search");
		String obj1 = scan.next();
		if (hash.containsKey(obj1)) {
			System.out.println("contact exists");
			Phone addphone = Phone.phone(name, phoneNumber, address);
			hash2.put(obj1, addphone);
			System.out.println(hash2.get(obj1));
		} else
			System.out.println("contact not found");

	}

	public static void UpdateContact() {
		boolean task = false;
		try {

			do {
				System.out.println(
						" Press 1. want to update a name  \n Press 2. want to update phoneNumber \n Press 3. want to update an address. \n Press 4 . Quit");
				System.out.println("enter a number");

				int u_key = scan.nextInt();

				switch (u_key) {
				case 1:
					updateName();
					break;
				case 2:
					updatePhoneNumber();
					break;
				case 3:
					updateAddress();
					break;
				case 4:
					task = true;
					break;
				}
			} while (task == false);
		} catch (InputMismatchException e) {
			System.out.println("enter valid input");
		}

	}

	public static void updateName() {

		System.out.println("enter key to update");
		String obj1 = scan.next();

		if (hash.containsKey(obj1))
			;
		{
			System.out.println("enter a new name:");
			String newName = scan.next();
			ContactList.setName(newName);
			hash1.replace(obj1, ContactList.name);
		}
	}

	public static void updatePhoneNumber() {
		System.out.println("enter key to update");
		String obj1 = scan.next();

		if (hash.containsKey(obj1))
			;
		{
			System.out.println("enter a new phoneNumber:");
			String newNum = scan.next();

			boolean check1 = checkNum(newNum);
			if (check1 == false) {
				boolean cn;
				do {
					System.out.println("enter valid Phonenumber");
					newNum = scan.next();
					cn = checkNum(newNum);
				} while (cn == false);
				ContactList.setNumber(newNum);
				hash1.replace(obj1, ContactList.phoneNumber);

			}
		}
	}

	public static void updateAddress() {

		System.out.println("enter key to update");
		try {
			String obj1 = scan.next();

			if (hash.containsKey(obj1))
				;
			{
				System.out.println("enter a new address:");
				String newAddress = scan.next();
				ContactList.setAddress(newAddress);
				hash1.replace(obj1, ContactList.address);
			}
		} catch (Exception e) {
			System.out.println("enter valid key");
		}
	}

	public static boolean checkName(String checkName) {
		String form = "\\w+[^0-9]";
		Pattern pat = Pattern.compile(form);
		Matcher match = pat.matcher(checkName);
		if (match.matches()) {
			return true;
		}
		return false;
	}

	public static boolean checkMail(String mail) {
		String form = "\\w+@\\w+\\.\\w+";
		Pattern pat = Pattern.compile(form);
		Matcher match = pat.matcher(mail);
		if (match.matches()) {
			return true;

		}
		return false;
	}

	public static boolean checkNum(String num) {
		String form = "[6,7,8,9]{1}[0-9]{9}";
		Pattern pat = Pattern.compile(form);
		Matcher match = pat.matcher(num);
		if (match.matches()) {
			return true;

		}
		return false;
	}

	public static void main(String[] args) {
		boolean quit = false;
		// printActions();
		try {
			printActions();
			System.out.println("enter your chioce:");
			int action = scan.nextInt();
			while (!quit) {
				switch (action) {
				case 1:
					addNewContact();
					printActions();
					System.out.println("enter a number:");
					action = scan.nextInt();
					break;
				case 2:
					DeleteContact();
					printActions();
					System.out.println("enter a number:");
					action = scan.nextInt();
					break;
				case 3:
					ShowContacts();
					printActions();
					System.out.println("enter a number:");
					action = scan.nextInt();
					break;
				case 4:
					SearchContact();
					printActions();
					System.out.println("enter a number:");
					action = scan.nextInt();
					break;
				case 5:
					UpdateContact();
					printActions();
					System.out.println("enter a number:");
					action = scan.nextInt();
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Invalid Number..Please Try again");
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("try again by entering a valid input");
		}
	}

}