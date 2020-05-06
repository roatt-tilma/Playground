import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int row = 1; row <= n; row++)
      {
        if (row%2 == 1)
        {
          for (int i = 1; i <= n-1; i++)
          	System.out.print(row);
          System.out.print(row+1);
          System.out.println();
        }
        else
        {
          System.out.print(row+1);
          for (int i = 1; i <= n-1; i++)
            System.out.print(row);
          System.out.println();
        }
      }
	}
}