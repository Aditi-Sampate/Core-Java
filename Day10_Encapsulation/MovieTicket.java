import java.util.Scanner;

class MovieTicket
{
	private String movieName;
	private int seatAvailable;
	private double ticketPrice;
	private double totalAmount;

	public void setMovieName(String name)
	{
		this.movieName = name;
	}

	public String getMovieName()
	{
		return movieName;
	}

	public void setSeatsAvailable(int seats)
	{
		this.seatAvailable =seats;
	}

	public int getSeatsAvailable()
	{
		return seatAvailable;
	}

	public void setTicketPrice(double price)
	{
		this.ticketPrice = price;
	}

	public void bookTickets(int tickets)
	{
		if(tickets > 0 && tickets <= seatAvailable)
		{
			seatAvailable = seatAvailable - tickets;
			totalAmount = tickets * ticketPrice;

			System.out.println("\n\n ");
			System.out.println(tickets + " tickets booked Successfully.");
			System.out.println("Total Amount: " + totalAmount);
		}

		else
		{
			System.out.println("Invalid number of tickets or not enough seats");
		}
	} 

	public void display()
	{
		System.out.println("Movie: "+ movieName);
		System.out.println("Seat Available:" +seatAvailable);
		System.out.println("Ticket Price: "+ ticketPrice);
	}


	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	
		MovieTicket m = new MovieTicket();


        System.out.print("Enter Movie Name: ");
        m.setMovieName(sc.nextLine());

        System.out.print("Enter Seats Available: ");
        m.setSeatsAvailable(sc.nextInt());

        System.out.print("Enter Ticket Price: ");
        m.setTicketPrice(sc.nextDouble());

        System.out.print("Enter tickets to book: ");
        m.bookTickets(sc.nextInt());

        m.display();


	}
}