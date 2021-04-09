import java.util.*;

class Day
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		String[] days= new String[7];
		System.out.println("Enter Days : ");
		
		for(int i=0;i<7;i++)
		{
			days[i]=sc.nextLine();
		}
		
		
		System.out.println("Enter the day number");
		int num=sc.nextInt();
		
		if(num>=1 && num<=7)
		System.out.println("Day of the week is " + days[num-1]);
		
		else
		System.out.println("Enter the valid Number");
	}
}

		
