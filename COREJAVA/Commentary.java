
import java.util.*;

class Delivery
{
	public void DeliveryDetails(String bowler,String batsmen)
	{
			System.out.println("Player details of the delivery");
			System.out.println("Bowler : "+bowler);
			System.out.println("Batsmen : "+batsmen);
	}
	public void DeliveryDetails(long runs)
	{
		System.out.println("Number of runs scored in the delivery : "+runs);
		
		if(runs==6)
			System.out.println("It is a Sixer");
		else if(runs==4)
				System.out.println("It is a boundary");
		else;
	}
}
class Commentary
{
	public static void main(String[] args)
	{
		
		Delivery d = new Delivery();
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu\n 1.player detals of the delivery \n 2.run details of the delivery\n 3.Exit");
		boolean NextOne= true;
		while(NextOne)
		{
			System.out.println("Enter your choice :");
			int ch =sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the bowler name :");
			
					String bowler = sc.next();
					System.out.println("Enter the batsmen name :");
					String batsmen = sc.next();
					d.DeliveryDetails(bowler , batsmen);
					break;
					
				case 2:
					System.out.println("Enter the number of runs:");
					long runs=sc.nextLong();
					d.DeliveryDetails(runs);
					break;	
				
				case 3:
					NextOne=false;
					break;
				default:
					System.out.println("Enter valid Option");
			}
		}
	}
}

																							
					
					
					
		
			