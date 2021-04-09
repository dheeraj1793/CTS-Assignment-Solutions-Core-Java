import java.util.*;
public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		TravelAgencies[] t=new TravelAgencies[4];
		for(int i=0;i<ta.length;i++)
		{
			int regNo=sc.nextInt();
			String agencyName=sc.nextLine();
			String packageType=sc.nextLine();
			int price=sc.nextInt();
			boolean flightFacility=sc.nextBoolean();
			t[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
		}
		
		int rno=sc.nextInt();
		String packTyp=sc.nextLine();
		
		
		System.out.println(findAgencyWithHighestPackagePrice(ta));
		TravelAgencies tr=agencyDetailsForGivenIdAndType(ta,rno,packTyp);
		if(tr==null)
		{
			System.out.println("No such agencies");
		}
		else
		System.out.println(tr.getagencyName()+"....."+tr.getprice());
	}
		
		
	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] t)
	{
		int max=t[0].getprice();
		for(int i=1;i<t.length;i++)
		{
			if(t[i].getprice>max)
			{
				max=t[i].getprice;
			}
		}
		return max;
	}
		
	public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] t,int r,String pack)
	{
		for(int i=0;i< t.length();i++)
		{
			
			if(t[i].getflightFacility()){
				if(t[i].getregNo()==rno && pack.equalsIgnoreCase(t[i].getpackageType)){
					return t[i];
				}
			}
		}
		return null;
	}
}

			
class TravelAgencies
{
	private int regNo;
	private String agencyName;
	private String packageType;
	private int price;
	private boolean flightFacility;
	//Constructor implementation
	TravelAgencies(int regNo,String agenctName,String packageType,int price,boolean flightFacility)
	
	{
		this.regNo=regNo;
		this.agencyName=agencyName;
		this.packageType=packageType;
		this.price=price;
		this.flightFacility=flightFacility;
	}
	//getter methods
	public int getregNo(int regNo)
	{
		return this.regNo;
	}
	public String getagencyName(String agencyName)
	{
		return this.agencyName;
	}
	public String getpackageType(String packageType)
	{
		return this.packageType;
	}
	public int getprice(int price)
	{
		return this.price;
	}
	public boolean getflightFacility(boolean flightFacility)
	{
		return this.flightFacility;
	}
}

	
	