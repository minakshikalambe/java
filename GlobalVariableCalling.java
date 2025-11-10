package batch59;

public class GlobalVariableCalling {
    static int staticVar = 100;

    int nonStaticVar = 200;

    public static void main(String[] args) {
    	
        System.out.println("Static Variable: " + staticVar);

        GlobalVariableCalling obj = new GlobalVariableCalling();
        System.out.println("Non-Static Variable: " + obj.nonStaticVar);
   }
}
