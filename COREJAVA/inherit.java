class p
{
	int a;
	int b;
	
	p(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent Class");
	}
}
class c extends p
{
	c()
	{
		super(1,2);
		System.out.println("Child Class");
	}
}
class inherit
{
	public static void main(String [] args)
	{
		//p o=new p(10 , 20);
		
		//c o2= new c();
		
		p o3 =new c();
	}
}
