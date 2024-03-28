import java.util.Scanner;

public class Student {
    private int sid;
    private String sname;
    private double marks;

    // Constructor
    public Student() {
        this.sid = 0;
        this.sname = "";
        this.marks = 0.0;
    }

    // Input method to input student details
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        this.sid = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Student Name:");
        this.sname = scanner.nextLine();
        System.out.println("Enter Marks:");
        this.marks = scanner.nextDouble();
    }

    // Output method to display student details
    public void output() {
        System.out.println("Student ID: " + this.sid);
        System.out.println("Student Name: " + this.sname);
        System.out.println("Marks: " + this.marks);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.output();
    }
}
