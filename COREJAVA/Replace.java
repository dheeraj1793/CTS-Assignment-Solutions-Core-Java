import java.util.*;
class Replace
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the content :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the old String :");
		String old=sc.nextLine();
		
		System.out.println("Enter the new String");
		String New= sc.nextLine();
		
		String replaceString=s1.replaceAll(old,New);
		System.out.println(replaceString);
	}
}
		
		
		