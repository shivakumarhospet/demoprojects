package AccessModifiers;
//1.class is having Default AccessModifiers

public class DefAccessSpecifier {
	
	void display()
	{
		System.out.println("You are using default AccessSpecifier");
	}
	
	public class AccessModifiers {
		
	

	public static void main(String[] args) {
		//default
		System.out.println("Default AccessSpecifier");
		DefAccessSpecifier obj = new DefAccessSpecifier();
		obj.display();
		
		

	}

}
