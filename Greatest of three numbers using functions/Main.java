import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int y = comp_two(n1,n2);
      int ans = comp_two(y,n3);
      System.out.print(ans);
    }
  public static int comp_two(int a, int b)
  {
    if (a > b)
      return a;
    else
      return b;
  }
}
