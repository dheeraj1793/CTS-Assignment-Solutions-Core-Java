import java.util.*;

interface IPlayerStatistics
{
	public void displayPlayerStatistics();
}
abstract class Player
{
	protected String name;
	protected String teamName;
	protected int noOfMatches;
	Player(String name,String teamName,int noOfMatches)
	{
			this.name = name;
			this.teamName = teamName;
			this.noOfMatches = noOfMatches;
	}
	public String getName()
	{
		return this.name;
	}
	public String getteamName()
	{
		return this.teamName;
	}
	public int  getnoOfMatches()
	{
		return this.noOfMatches;
	}
	
}
class CricketPlayer extends Player implements IPlayerStatistics
{
	private int totalRunsScored;
	private int noOfWicketsTaken;
	
	CricketPlayer(String name,String teamName,int noOfMatches,int totalRunsScored,int noOfWicketsTaken)
	{
		super(name,teamName,noOfMatches);
		this.totalRunsScored=totalRunsScored;
		this.noOfWicketsTaken=noOfWicketsTaken;
	}
	public int gettotalRunsScored()
	{
		return this.totalRunsScored;
	}
	public int getnoOfWicketsTaken()
	{
		return this.noOfWicketsTaken;	
	}	
	
	
	public void displayPlayerStatistics()
	{
		System.out.println("----- Player Details -----");
		System.out.println("Player Name : "+ this.getName());
		System.out.println("Team Name : "+this.getteamName());
		
		System.out.println("No of Matches : "+this.getnoOfMatches());
		System.out.println("Total Runs Scored : "+this.gettotalRunsScored());
		System.out.println("No of Wickets taken : "+this.getnoOfWicketsTaken());
	}
}
		


class HockeyPlayer extends Player implements IPlayerStatistics
{
	private String Position;
	private int noOfGoals;
	
	HockeyPlayer(String name,String teamName,int noOfMatches,String Position,int noOfGoals)
	{
		super(name,teamName,noOfMatches);
		this.Position=Position;
		this.noOfGoals=noOfGoals;
	}
	
	public String getPosition()
	{
		return this.Position;
	}
	public int getnoOfGoals()
	{	
		return this.noOfGoals;	
	}
	
	public void displayPlayerStatistics()
	{
		System.out.println("----- Player Details -----");
		System.out.println("Player Name : "+ this.getName());
		System.out.println("Team Name : "+this.getteamName());
		
		System.out.println("No of Matches : "+this.getnoOfMatches());
		System.out.println("Position  : "+this.getPosition());
		System.out.println("No of Goals Taken : "+this.getnoOfGoals());
	}
}

class PlayerMain
{
	public static void main(String [] args)
	{
		System.out.println("Menu\n 1.Cricket Player \n 2.Hockey Player");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice :");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter Player name :");
				sc.nextLine();
				String p= sc.nextLine();
				
				System.out.println("Enter Team Name :");
				String t1 = sc.nextLine();
				System.out.println("Enter Matches Played :");
				int  m1= sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Runs scored :");
				int  r1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter No of wickets Taken :");
				int w1=sc.nextInt();
				
				
				
				
				CricketPlayer cp = new CricketPlayer(p,t1,m1,r1,w1);
		
				cp.displayPlayerStatistics();
				break;
			
			
			case 2:
				System.out.println("Enter Player name :");
				sc.nextLine();
				String p2= sc.nextLine();
			
				System.out.println("Enter Team Name :");
				String t2 = sc.nextLine();
				
				System.out.println("Enter Matches Played:");
				int m2= sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Position:");
				String p1 = sc.nextLine();
				
				System.out.println("Enter goals taken:");
				int g2= sc.nextInt();
				
				
				
				
				HockeyPlayer hp = new HockeyPlayer(p2,t2,m2,p1,g2);
				
				hp.displayPlayerStatistics();
				break;
		}
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	