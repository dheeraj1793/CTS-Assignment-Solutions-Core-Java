import java.time.*; 
import java.time.temporal.ChronoUnit; 
import java.util.*;



 class UserMainCode { 
    public static void displayDate(String s)
    { 
  
       
        LocalDate LD = LocalDate.parse(s); 
  
        
        LocalDate res = LD.minus(20, ChronoUnit.MONTHS); 
  
       
        System.out.println("20 months before "+s+" will be "+res);  
    } 
} 

class EMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String date = sc.nextLine();
		
		UserMainCode uc = new UserMainCode();
		uc.displayDate(date);
	}
}

		