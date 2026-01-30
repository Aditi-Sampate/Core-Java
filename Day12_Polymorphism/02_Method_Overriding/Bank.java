import java.util.Scanner;

class Bank {

    double getInterestRate() {
        return 5.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b;

        System.out.println("Choose Bank:");
        System.out.println("1. SBI");
        System.out.println("2. HDFC");
        int choice = sc.nextInt();

        if (choice == 1) {
            b = new SBI();
            System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");
        } 
        else if (choice == 2) {
            b = new HDFC();
            System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}