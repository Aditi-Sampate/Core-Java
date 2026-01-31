import java.util.Scanner;

abstract class Payments {
    double amount;
    abstract void pay();
}

class CardPayment extends Payments {
    @Override
    void pay() {
        System.out.println("Paid $" + amount + " using Card");
    }
}

class UpiPayment extends Payments {
    @Override
    void pay() {
        System.out.println("Paid $" + amount + " using UPI");
    }
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payments p;

        System.out.println("Enter payment type: 1.Card 2.UPI");
        int type = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter amount to pay:");
        double amt = sc.nextDouble();
        
        if(type == 1)
        {
          p = new CardPayment();
        }

        else
        {
          p = new UpiPayment();
        }


        p.amount = amt;
        p.pay();
    }
}