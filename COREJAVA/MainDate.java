import java.util.*;
import java.text.SimpleDateFormat; 

import java.util.Calendar;

class UserMainCode
{
	public static void displayDate(String s)
	{
		Date d = new Date(s);
	  SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	  String str = date.format(d);
	  System.out.println(str);
	}
}



class MainDate {
    public static void main( String args[] ) {

		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		
		UserMainCode u = new UserMainCode();
		u.displayDate(s);
		
	  
	}
}
