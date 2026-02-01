import java.util.Scanner;

// Interface 
interface DeliveryCharge
{
    double calculateCharge(double distance);
}

// Standard delivery class
class StandardDelivery implements DeliveryCharge
{
    public double calculateCharge(double distance)
    {
        return distance * 10; 
    }
}

// Express delivery class
class ExpressDelivery implements DeliveryCharge
{
    public double calculateCharge(double distance)
    {
        return (distance * 15) + 50; 
    }
}

// Same-day delivery class
class SameDayDelivery implements DeliveryCharge
{
    public double calculateCharge(double distance)
    {
        return (distance * 20) + 100;
    }
}

// Main class
public class DeliveryChargeSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DeliveryCharge charge = null;

        System.out.print("Enter delivery distance (km): ");
        double distance = sc.nextDouble();

        System.out.println("\n Select Delivery Type:");
        System.out.println("1. Standard Delivery");
        System.out.println("2. Express Delivery");
        System.out.println("3. Same Day Delivery");
       
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

      
        if (choice == 1)
        {
            charge = new StandardDelivery();
        }

        else if (choice == 2)
        {
            charge = new ExpressDelivery();
        }

        else if (choice == 3)
        {
            charge = new SameDayDelivery();
        }

        else
        {
            System.out.println("Invalid choice!");
            
        }

        double finalCharge = charge.calculateCharge(distance);
        
        System.out.println("Total Delivery Charge: " + finalCharge);

        
    }
}