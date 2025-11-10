package batch59;
interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show");
    }
}

class D implements B, C {
    // Must override show() to resolve ambiguity
    @Override
    public void show() {
        // You can choose explicitly which one to call
        B.super.show(); // or C.super.show()
        System.out.println("D's own show");
    }
}

public class DiamondProblemDemo {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}

