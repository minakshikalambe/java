package batch59;

public class AutomationTwo {
	AutomationTwo()   //constructor
        {
                System.out.println("Constructor 1");
        }
	AutomationTwo(int a)   //constructor
        {
                System.out.println("Constructor 2");
        }
	AutomationTwo(int a,String b)   //constructor
        {
                System.out.println("Constructor 3");
        }
	AutomationTwo(int a,int b)   //constructor
        {
                System.out.println("Constructor 4");
        }
        public static void main(String[] args) //main method
        {
        	AutomationTwo manish=new AutomationTwo();//this is the syntax of creating an Object
                AutomationTwo anuj=new AutomationTwo(100);//this is the syntax of creating an Object
                AutomationTwo aparna=new AutomationTwo(100,"Manish");//this is the syntax of creating an Object
                AutomationTwo anthony=new AutomationTwo(100,500);//this is the syntax of creating an Object

        }

}
//Automation-Class
//Automation()->Constructor