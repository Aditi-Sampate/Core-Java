import java.util.Scanner;

// Interface 1
interface MeterValidation 
{
    boolean validateMeter(int meterNo);
}

// Interface 2
interface BillCalculation 
{
    double calculateBill(int units);
}

// Interface 3
interface Subsidy 
{
    double applySubsidy(double amount, int units);
}

// Interface 4
interface Display 
{
    void displayBill(double amount);
}

class ElectricitySystem implements MeterValidation, BillCalculation, Subsidy, Display {

    public boolean validateMeter(int meterNo) 
    {
        return meterNo > 0;
    }

    public double calculateBill(int units) 
    {
        if (units <= 100)
        {
            return units * 10;
        }

        else if(units <= 300)
        {
            return units * 12;
        }

        else
        {
            return units * 20;
        }
    }

    public double applySubsidy(double amount, int units) 
    {
        if (units <= 100)
        {
            return amount - 50;
        }

        return amount;
    }

    public void displayBill(double amount) 
    {
        System.out.println("Total Electricity Bill: " + amount);
    }
}

public class ElectricityBill {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElectricitySystem eb = new ElectricitySystem();

        System.out.print("Enter Meter Number: ");
        int meterNo = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        if (!eb.validateMeter(meterNo)) 
        {
            System.out.println("Invalid Meter Number!");
            return;
        }

        double amount = eb.calculateBill(units);
        amount = eb.applySubsidy(amount, units);

        eb.displayBill(amount);
    }
}