import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 1; i<=n; i++)
        System.out.print("*");
      System.out.println();
      for (int r = 1; r<=n-2; r++)
      {
        System.out.print("*");
        for (int space =1; space<= n-2; space++)
          System.out.print(" ");
        System.out.print("*");
        System.out.println();
      }
      for(int i = 1; i<=n; i++)
        System.out.print("*");
	}
}