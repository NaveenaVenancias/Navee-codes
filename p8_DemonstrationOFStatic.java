package zoho_assignment1;

public class p8_DemonstrationOFStatic {
	static int a=20;
	static int b;
	
	static {
		System.out.println("static block intialized");
		System.out.println("Value of a is: "+a);
		b=++a;
	}
	static void staticMethod() {
		System.out.println("inside from static method. calling me without creating object");
	}
		
	public static void main(String[] args){
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
		
		staticMethod();
	}

}
