import java.util.*;

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
	public double getArea()
	{
		double Area=0.00;
		return Area;
	}
}
class Rectangle extends shape
{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth)
    {
		super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea()
    {
        return length * breadth;
    }
}



class Circle extends shape
{
	private double radius;
	Circle(double radius)
	{
		super("Circle");
		this.radius = radius;
	}
	public double getArea()
	{
		return 3.14d*radius*radius;
		
	}
}
class Square extends shape
{
    double side;

    Square(double side)
    {
		super("Square");
        this.side = side;
    }

    public double getArea()
    {
        return side * side;
    }
}

class Hexagon extends shape
{
    double side;

    Hexagon(double side)
    {
		super("Hexagon");
        this.side = side;
    }

    public double getArea()
    {
        return ((3 * Math.sqrt(3) *  (side * side)) / 2); 
    }
}
class AreaOfShapes
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Hexagon\n5.Exit");
		boolean others = true;
		while(others)
		{
		System.out.println("Area calculator --- Choose your shape");
		
		int ch=sc.nextInt();
		
		
		
		switch(ch)
		{
			case 1:
					System.out.println("Enter Length : ");
					int l=sc.nextInt();
					System.out.println("Enter breadth : ");
					int b=sc.nextInt();
					shape r = new Rectangle(l,b);
					System.out.println(r.getName()+"......"+String.format("%.2f",r.getArea()));
					break;
					
			case 2:
					System.out.println("Enter Side : ");
					int side=sc.nextInt();
					shape s = new Square(side);
					System.out.println(s.getName()+"......"+String.format("%.2f",s.getArea()));
					break;		
			case 3:
					System.out.println("Enter Radius : ");
					int rad=sc.nextInt();
					shape c = new Circle(rad);
					System.out.println(c.getName()+"......"+String.format("%.2f",c.getArea()));
					break;	
			case 4:
					System.out.println("Enter Side : ");
					int hs=sc.nextInt();
					shape h = new Hexagon(hs);
					System.out.println(h.getName()+"......"+String.format("%.2f",h.getArea()));
					break;	
			
			case 5:
					others = false;
					break;	
			default:
				System.out.print("Enter Valid number");
		}
		}
			
		
		
		
		
	}
}
