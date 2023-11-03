 class CustomSingleton {
    private static volatile CustomSingleton instance;
   

    private CustomSingleton() {
    }

    public static CustomSingleton getInstance() {
        if (instance == null) {
            synchronized (CustomSingleton.class) {
                if (instance == null) {
                    instance = new CustomSingleton();
                }
            }
        }
        return instance;
    }

    // Add other methods and properties here
    public void doSomething() {
        System.out.println("Custom Singleton instance is doing something.");
    }
}
  public class CusomSingleton{
        public static void main(String[] args) {
            // Get the instance of the CustomSingleton class
            CustomSingleton singleton1 = CustomSingleton.getInstance();
            CustomSingleton singleton2 = CustomSingleton.getInstance();

            // Call methods on the CustomSingleton instances
            singleton1.doSomething();
            singleton2.doSomething();
        }
    }


