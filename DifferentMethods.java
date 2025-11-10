package batch59;

public class DifferentMethods {
    public void publicMethod() {
        System.out.println("This is a PUBLIC method");
    }

    protected void protectedMethod() {
        System.out.println("This is a PROTECTED method");
    }

    void defaultMethod() {
        System.out.println("This is a DEFAULT method");
    }

    private void privateMethod() {
        System.out.println("This is a PRIVATE method");
    }

    public static void main(String[] args) {
    	DifferentMethods obj = new DifferentMethods();

        obj.publicMethod();     
        obj.protectedMethod();  
        obj.defaultMethod();    
        obj.privateMethod();    
    }
}
