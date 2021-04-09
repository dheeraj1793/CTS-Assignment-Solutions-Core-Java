import java.util.*;

class Sum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int[] Tents = new int[n];
		int sum=0;
		int i=0;
		while(i < n){
		Tents[i]=sc.nextInt();
		sum += Tents[i];
		i++;
		}
		System.out.print(sum);
	}
}

		
		