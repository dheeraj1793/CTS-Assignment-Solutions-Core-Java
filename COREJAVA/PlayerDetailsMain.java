import java.util.*;
import java.io.*;

class Player
{
	private String name;
	private String country;
	private String skill;
	
	Player()
	{
		this("name","country","skill");
	}
	
	
	Player(String name,String country,String skill)
	{
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
	public String toString()
	{
		return (String.format("%-15s %-15s %-15s ",this.name,this.country,this.skill));
	}
	public void display(ArrayList<Player> a)
	{
		System.out.println("Player Details");
		
		for (int j=0; j < a.size(); j++)
        {
            System.out.println(a.get(j));
        }
       
		
	}
	
	
	
	
	public String getName()
	{
		return this.name;
	}
	public String getCountry()
	{
		return this.country;
	}
	public String getSkill()
	{
		return this.skill;
	}
	
}
 
 class PlayerDetailsMain
 {
	 public static void main(String [] args) throws Exception
	 {
		 //Scanner sc = new Scanner(System.in);
		 BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter Number of Players :");
		 int n =  Integer.parseInt(sc.readLine());
		 
		 ArrayList<Player> lp = new ArrayList<Player>();

		 
		 
		 
		 for(int i=1;i<=n;i++)
		 {
			 System.out.println("Enter Player Name "+i+" :");
			 
			 
			  String pn=sc.readLine();
			  
			 System.out.println("Enter Player Country "+i+" :");
			
			
			  String pc=sc.readLine();
			 
			 System.out.println("Enter Player Skill "+i+" :");
			 
			  String ps= sc.readLine();

		
			Player p = new Player(pn,pc,ps);
			
			lp.add(p);
		 
		
		 
		 }
		 new Player().display(lp);
		 
		 
	}
 }
 
		 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 