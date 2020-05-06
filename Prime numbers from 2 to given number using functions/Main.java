import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 2; i <= n; i++)
        prime(i);
    }
  public static void prime(int n)
  {
      for (int i = 2; i <= n/2; i++)
    	{
      	if (n%i == 0)
      	{
        	n = 0;
        	break;
      	}
    	}
    	if (n != 0)
      		System.out.println(n);
  }
}