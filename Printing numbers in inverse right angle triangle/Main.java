import java.util.Scanner;
class Main{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int row = 0; row < n; row++)
      {
        for (int col = n-row; col != 0; col--)
          System.out.print(col);
        System.out.println();
      }
    }
}