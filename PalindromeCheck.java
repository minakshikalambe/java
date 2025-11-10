package batch59;

public class PalindromeCheck {
public static void main(String[] args) {
	String name ="mam";
	String name2="";
	for(int i=name.length()-1;i>-1;i--)
	{
		name2=name2+name.charAt(i);
	}
	System.out.println(name2);
	if(name.contentEquals(name2))
	{
		System.out.println("Yes it is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
