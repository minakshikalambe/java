package batch59;

class ClassA {
 void method1() {
     System.out.println("This is method1");
 }
}

class ClassB extends ClassA {
 void method2() {
     System.out.println("This is method2");
 }
}

class ClassC extends ClassB {
 void method3() {
     System.out.println("This is method3");
 }
}

public class MultiLevelInheritance  {
 public static void main(String[] args) {
     ClassC obj = new ClassC();

     obj.method1();
     obj.method2(); 
     obj.method3(); 
 }
}

