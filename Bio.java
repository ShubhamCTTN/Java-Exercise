//Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

package exercise;
public class Bio {

	static String FirstName = "John";
	static String LastName = "Wick";
	static int age = 44;
	
	static void bio()
	{
		System.out.println("First Name : "+FirstName);
		System.out.println("Last Name : "+LastName);
		System.out.println("Age : "+age);
	}

	static {
		String F_Name = "Mike";
		String L_Name = "Tyson";
		int ages = 72;
		System.out.println(F_Name + " \n" + L_Name + " \n" + ages);
	}
	
	public static void main(String[] args) {

	System.out.println("First Name : "+FirstName);
	System.out.println("Last Name : "+LastName);
	System.out.println("Age : "+age);

	System.out.println("---------");
	bio();
	}
}


