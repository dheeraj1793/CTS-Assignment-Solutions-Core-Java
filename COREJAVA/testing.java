class testing
{
  public static void main(String []args){
   String strMain = "Alph|Beta|Delt|Gamma|Sigma";
    String[] arrSplit = strMain.split("\\|");
    for (int i=0; i < arrSplit.length; i++)
    {
      System.out.println(arrSplit[i]);
    }
  }
}

			 
