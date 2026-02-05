import java.util.LinkedList;

class HospitalManagement
{
	public static void main(String[] args) 
	{
		LinkedList<String> patients	= new LinkedList<>();
		LinkedList<String> emergencypatients = new LinkedList<>();

		//Patients arrive
		patients.add("Patients A");
		patients.add("Patients B");
		patients.add("Patients C");

		System.out.println("Patients List :");
		System.out.println(patients);

		emergencypatients.add("Patients 1");
		emergencypatients.add("Patients 2");
		emergencypatients.add("Patients 3");
		//Emergency Patient (Added at front)

		patients.addFirst("Emergency Patients");
		System.out.println("\n After Emergency Arrival :");
		System.out.println(emergencypatients);

		//Serve Patient First Come First Out
		String served = patients.removeFirst();
		System.out.println("\nServed :"+served);

		//Current Patient
		System.out.println("Current Patients :"+patients.getFirst());

		System.out.println("\n Remaining Patients :");
		System.out.println(patients);
	}
}