import java.util.*;

class Card
{
	private String holderName;
	private String cardNumber;
	private String expiryDate;
	
	Card(String holderName,String cardNumber ,String expiryDate)
	{
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}
	public String getName()
	{
		return this.holderName;
	}
	public String getcardNumber()
	{
		return this.cardNumber;
	}
	public String getexpiryDate()
	{
		return this.expiryDate;
	}
}

class MemberShipCard extends Card
{
	private int rating;
	MemberShipCard(String holderName,String cardNumber ,String expiryDate,int rating)
	{
		super(holderName,cardNumber,expiryDate);
		this.rating = rating;
	}
	public int getRating()
	{
		return this.rating;
	}
}
class PaybackCard extends Card
{
	private int pointsEarned;
	private double totalAmount;
	
	PaybackCard(String holderName,String cardNumber ,String expiryDate,int pointsEarned,double totalAmount)
	{
		super(holderName,cardNumber,expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount =  totalAmount;
	}
	public int getpointsEarned()
	{
		return this.pointsEarned;
	}
	public double gettotalAmount()
	{
		return this.totalAmount;
	}
}
 class CardMain
 {
	 public static void main(String [] args)
	 {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Select the Card");
		System.out.println("1.Payback Card \n 2.Membership Card");
		System.out.println("Enter your option");
		int ch= sc.nextInt();
	 
		 System.out.println("Enter your card details  (Separated by | Symbol  as name|number|date)");
		 String s= sc.next();
		 
		 String[] details = s.split("\\|"); 
		 switch(ch)
		 {
			 case 1:
					
					System.out.println("Enter points in card");
					int points= sc.nextInt();
					System.out.println("Enter Amount ");
					double amount = sc.nextDouble();
					
					PaybackCard pay = new PaybackCard(details[0],details[1],details[2],points,amount);
					
					System.out.println(pay.getName()+"'s Card Details"); 
					System.out.println("Card Number : " +pay.getcardNumber());
					System.out.println("Points Earned : " +pay.getpointsEarned());
					System.out.println("Total Amount : " +pay.gettotalAmount());
					break;
			case 2:
					
					System.out.println("Enter rating  in card");
					int rate= sc.nextInt();
					MemberShipCard mem = new MemberShipCard(details[0],details[1],details[2],rate);
					System.out.println(mem.getName()+"'s Card Details"); 
					System.out.println("Card Number : " +mem.getcardNumber());
					System.out.println("Rating : " +mem.getRating());
		
					break;
		 }
	 }
 }
 
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		