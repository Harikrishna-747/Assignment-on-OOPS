public class StaticDemo {
    private static int count = 0; // Static member variable

    // Static method to increment the count
    public static void incrementCount() {
        count++;
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Accessing static member variable and method without creating an object
        System.out.println("Initial Count: " + StaticDemo.getCount());

        // Incrementing count using static method
        StaticDemo.incrementCount();
        System.out.println("Count after increment: " + StaticDemo.getCount());

        // Incrementing count directly (not recommended)
        count++;
        System.out.println("Count after direct increment: " + StaticDemo.getCount());

        // Incrementing count using static method again
        StaticDemo.incrementCount();
        System.out.println("Count after second increment: " + StaticDemo.getCount());
    }
}

