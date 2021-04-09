
import java.util.*;

class Main11
{
	
	 
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		//String d= sc.next();
		System.out.println(user.extract(s));
	}
}
class user
{
	public static String extract(String s)
	{
		int i=0;
		Scanner sc1 = new Scanner(System.in);
		String d = sc1.next();
		
		String[] str =new String[3];
		
		StringTokenizer st = new StringTokenizer(s,d);  
		while (st.hasMoreTokens()) {  
			str[i++]=st.nextToken();  
     } 
	 int maxLength = 0;
    String longestString = null;
    for (String si : str) {
      if (si.length() > maxLength) {
        maxLength = si.length();
        longestString = si;
	  }
	}
	return longestString;
	 
		 
   }  
} 



















