public class MyClass {
    private int number;

    // Constructor
    public MyClass(int number) {
        // Using 'this' keyword to distinguish between instance variable and constructor parameter
        this.number = number;
    }

    // Method to set the number
    public void setNumber(int number) {
        // Using 'this' keyword to refer to the instance variable
        this.number = number;
    }

    // Method to get the number
    public int getNumber() {
        // Using 'this' keyword is optional here, but it's often used for clarity
        return this.number;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        System.out.println("Number set via constructor: " + obj1.getNumber());

        obj1.setNumber(20);
        System.out.println("Number after setting via method: " + obj1.getNumber());
    }
}

