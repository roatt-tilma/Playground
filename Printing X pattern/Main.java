import java.util.Scanner;
class Main {
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        for (int row = 1; row <= n/2; row++)
        {
          for (int space = 1; space < row; space++)
          	System.out.print(" ");
          System.out.print("*");
          for (int space = 1; space <= (n-2*row); space++)
            System.out.print(" ");
          System.out.print("*");
          System.out.println();
        }
      	for (int space = 1; space <= n/2; space++)
          System.out.print(" ");
        System.out.print("*");
        System.out.println();
        int num = 1;
        for (int row = n/2; row != 0; row--)
        {
          for (int space = 1; space <= row-1; space++)
            System.out.print(" ");
          System.out.print("*");
          for (int space = 1; space <= num; space++)
            System.out.print(" ");
          System.out.print("*");
          System.out.println();
          num = num + 2;
        } 
	}
}