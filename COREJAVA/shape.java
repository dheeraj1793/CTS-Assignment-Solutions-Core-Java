class shape
{
	private String name;
	shape(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}
class Circle extends shape
{
	Circle()
	{
		super("Circle");
	}
	public double getArea()
	{
		double Area = 3.14d*4*4;
		return Area;
	}
}
class Main
{
	public static void main(String[] args)
	{
		shape s = new Circle();
		//System.out.println(s.getName()+ "......" + s.getArea());
	}
}
