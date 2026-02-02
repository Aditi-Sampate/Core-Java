import java.util.Scanner;

interface Appointment
{
	void bookAppointment(String doctor);
}

interface BillingService
{
	double generateBill();
}

interface NotificationService
{
	void notifuPatient();
}

class HospitalSystem implements Appointment,BillingService, NotificationService
{
	public void bookAppointment(String doctor)
	{
		System.out.println("Appointment Booked with Dr."+doctor);
	}

	public double generateBill()
	{
		return 700;
	}

	public void notifuPatient()
	{
		System.out.println("Patient Notified Successfully");
	}
}

public class Hospital
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		HospitalSystem hospital = new HospitalSystem();

		System.out.println("Enter Doctor Name :");
		String doctor = sc.nextLine();

		hospital.bookAppointment(doctor);

		System.out.println("Bill Amount :"+hospital.generateBill());
		hospital.notifuPatient();
	}
}