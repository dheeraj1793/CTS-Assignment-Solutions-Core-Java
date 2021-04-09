import java.util.*;

class Box implements Comparable<Box>
{
	private double length;
	private double width;
	private double height;
	
	private double volume;
	
	Box(double length,double width,double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume = this.length*this.width*this.height;
	}
	public String toString()
	{
		return "Length :"+length+" Width :"+width +" Height :"+height+ " Volume :"+String.format("%.2f",volume); 
	}
	int v = (int)volume;
	public int hashCode() {
	    //System.out.println("In hashcode");
	    return this.v;
	}
	
	
	 public boolean equals(Object obj){
        //System.out.println("In equals");
        if (obj instanceof Box) {
            Box pp = (Box) obj;
            return (pp.volume == this.volume);
        } else {
            return false;
        }
    }
	
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	
	public int compareTo(Box b)   
	{
		Double v1 = this.volume;
		Double v2 = b.volume;
		
		return v1.compareTo(v2);
	}
	
	
	
	
	
	
}

class Unique
{
	public static void main(String[] args)
	{
		Box b = null;
		TreeSet<Box> s =  new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Boxes :");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Box "+i+ " details");
			System.out.println("Enter Length");
			double l = sc.nextDouble();
			
			System.out.println("Enter Width");
			double w = sc.nextDouble();
			
			System.out.println("Enter Height");
			double h = sc.nextDouble();
			
		
			 b= new Box(l,w,h);
			 s.add(b);
		}
		System.out.println("Unique boxes in the Set :");
		
		for(Box box:s){
            System.out.println(box);
		}
		
		
		
		
	
	}
}

		









