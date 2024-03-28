public class BankCustomer {
    private int acno;
    private String atype;
    private double amt;

    // Constructor with no arguments
    public BankCustomer() {
        this.acno = 0;
        this.atype = "";
        this.amt = 0.0;
    }

    // Constructor with account number and account type arguments
    public BankCustomer(int acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0.0; // Set initial balance to 0
    }

    // Constructor with all arguments
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void display() {
        System.out.println("Account Number: " + this.acno);
        System.out.println("Account Type: " + this.atype);
        System.out.println("Balance Amount: " + this.amt);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        BankCustomer customer1 = new BankCustomer();
        BankCustomer customer2 = new BankCustomer(12345, "Savings");
        BankCustomer customer3 = new BankCustomer(54321, "Current", 1000.0);

        // Displaying customer details
        customer1.display();
        customer2.display();
        customer3.display();
    }
}

