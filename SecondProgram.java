package batch59;

public class SecondProgram {
	
	static void add()// consider this is first house of locality
	{
		int a=2;  // local variable
		int b=5;
		int c= a+b;
		System.out.println(c);
	}
	static void subtraction(){
		int a=2;
		int b=5;
		int c= a-b;
		System.out.println(c);
	}
	static void multiplication(){
		int a=2;
		int b=5;
		int c= a*b;
		System.out.println(c);
	}
	static void div(){
		int a=2;
		int b=5;
		int c= a/b;
		System.out.println(c);
	}
	static void mod(){
		int a=2;
		int b=5;
		int c= a%b;
		System.out.println(c);
	}
public static void main(String[] args) {
	add();
	subtraction();
	mod();
}
}
