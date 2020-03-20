public class Phone {

	String name;
	String phonenumber;
	String address;
	Phone(String name,String phonenumber,String address)
	{
		this.name=name;
		this.phonenumber=phonenumber;
		this.address=address;
	}
	
	public String toString()
	{
		return name + " " + phonenumber +" "+ address;
	}
	
	public static Phone phone(String name,String phonenumber,String address)
	{
		return new Phone(name ,phonenumber,address);
	}
	
}