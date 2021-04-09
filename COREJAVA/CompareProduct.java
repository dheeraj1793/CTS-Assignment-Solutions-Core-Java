import java.util.*;

class Product
{
	private long id;
	private String productName;
	private String suppilerName;
	
	Product(long id,String productName,String suppilerName)
	{
		this.id = id;
		this.productName = productName;
		this.suppilerName = suppilerName;
	}
	
	//OVERRIDING OF .equals() METHOD
	
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		
		if( obj instanceof Product)
		{
			Product p=(Product)obj;
			if(this.id == p.id && this.productName.equals(p.productName) && this.suppilerName.equals(p.suppilerName))
			{
				return true;
			}
			return false;
		}
		return false;
	}
	
	public long getId()
	{
		return this.id;
	}
	public String getProductName()
	{
		return this.productName;
	}
	public String getSupplierName()
	{
		return this.suppilerName;
	}
}

class CompareProduct
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id 1:");
		long id = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter product name 1:");
		String n= sc.nextLine();
		
		System.out.println("Enter Suppiler name 1:");
		String sp =sc.nextLine();
		
		System.out.println("Enter product id 2:");
		long id1 = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter product name 2:");
		String n1= sc.nextLine();
		
		System.out.println("Enter Suppiler name 2:");
		String sp1 =sc.nextLine();
		
		Product p1 = new Product(id,n,sp);
		Product p2 = new Product (id1,n1,sp1);
		
		
		if(p1.equals(p2))
			System.out.println("The two products are the same");
		else
			System.out.println("The two products are different");
	}
}

		
		





















