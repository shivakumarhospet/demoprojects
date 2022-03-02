package AccessModifiers1;

//2.using private AccessModifiers

public class PriAccessSpecifier {
	
	private void display()
	{
		System.out.println("you are using private AccessSpecifier");
	}
	
	public class AccessModifier1 {
	

	public static void main(String[] args) {
		// private
		System.out.println("Private AccessSpecifier");
		PriAccessSpecifier obj = new PriAccessSpecifier();
		//trying to access private method of another class
		//obj.display();
		
	}
	
	
	}
	 
