import java.util.Scanner;

//Interface 1
interface MemberCheck{
	boolean isValidMember(int memberId);
}

//Interface 2
interface BookLimit{
	boolean canIssueBook(int issuedBooks);
}

//Interface 3
interface FeeCalculation{
	int calculateLateFee(int daysLate);
}

//Interface 4
interface Message{
	void showMessage(String msg);
}

class LibrarySystem implements MemberCheck,BookLimit,FeeCalculation,Message
{
	public boolean isValidMember(int memberId)
	{
		return memberId > 1000;
	}

	public boolean canIssueBook(int issuedBooks)
	{
		return issuedBooks < 3;
	}
	public int calculateLateFee(int daysLate)
	{
		return daysLate * 5;
	}
	public void showMessage(String msg)
	{
		System.out.println(msg);
	}
}

public class Library{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		LibrarySystem lib = new LibrarySystem();

		System.out.println("Enter Member ID (>=1000):");
		int memberId = sc.nextInt();

		System.out.println("Books Already issued (<= 4):");
		int issuedBooks = sc.nextInt();

		System.out.println("Days Late () if none):");
		int daysLate = sc.nextInt();

		if(!lib.isValidMember(memberId))
		{
			lib.showMessage("Invalid Member ID !");
			return;
		}	
		if(!lib.canIssueBook(issuedBooks))
		{
			lib.showMessage("Book issue limit reached !");
			return;
		}

		int fee = lib.calculateLateFee(daysLate);

		System.out.println("\n");

		lib.showMessage("Book Issued Successfuly...!");
		System.out.println("Late Fee :"+fee);
	}
}