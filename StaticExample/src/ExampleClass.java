// ExampleClass.java
// ExampleClass.java
public class ExampleClass {
    static {
        System.out.println("This is a static block in ExampleClass.");
    }

    public static void someMethod() {
        System.out.println("This is a method in ExJampleClass.");
    }

    // Inner static class
    public static class InnerStaticClass {
        static {
            System.out.println("This is a static block in InnerStaticClass.");
        }

        public static void innerStaticMethod() {
            System.out.println("This is a method in InnerStaticClass.");
        }
    }
}

class AnotherClass {
 public static void main(String[] args) {
     ExampleClass.someMethod(); // This line will execute the static block in ExampleClass before calling the method.
     ExampleClass.InnerStaticClass.innerStaticMethod(); // This line will execute the static block in InnerStaticClass before calling the method.
 }
}



