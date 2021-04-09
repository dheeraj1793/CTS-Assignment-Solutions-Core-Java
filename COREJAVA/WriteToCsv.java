import java.io.*;

class WriteToCsv
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Name of the Player :");
		String name = sc.readLine();
		
		System.out.println("Enter Team name :");
		String team = sc.readLine();
		
		System.out.println("Enter Number of matches played :");
		int n = Integer.parseInt(sc.readLine());
		
		String FilePath = "player.txt";
		
		SaveToFile(name,team,n,FilePath);
		
	}
	
	static void SaveToFile(String name,String team,int n,String path)
	{
		try
		{
			FileWriter fw = new FileWriter(path,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(name+","+team+","+n);
			pw.flush();
			
			System.out.println("Sucessfuly saved into file");
		}
		catch(Exception E)
		{
			System.out.println("Not Saved");
		}			
	}
}

		
