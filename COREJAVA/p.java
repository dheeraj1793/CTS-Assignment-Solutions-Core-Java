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
	}
}
class Main
{
	public static void main(String [] args)
	{
		p o=new p(10 , 20);
	}
}
