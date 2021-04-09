import java.io.*;
import java.util.*;

class Score
{
	public static void main(String[] args) throws Exception
	{
		
		int max=Integer.MIN_VALUE;
		String high =null;
		
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,Integer> hm = new HashMap<>();
		System.out.println("Enter No of Players :");
		int n = Integer.parseInt(sc.readLine());
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the details of Player "+i);
			String name = sc.readLine();
			int runs = Integer.parseInt(sc.readLine());
			
			hm.put(name , runs);
			
		}
		Set<Map.Entry<String,Integer>> entries=hm.entrySet();
    
	
		for(Map.Entry<String,Integer> entry:entries) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				high=entry.getKey();
			}
		}
		System.out.println(high);
		
	
		
	}
}

			
			
			
		
	