package batch59;

public class AssertExample {

    public static void main(String[] args) {
        int age = 15; 

        assert age >= 18 : "Age is less than 18, not eligible";

        System.out.println("Age is " + age + " → Eligible!");
    }
}

