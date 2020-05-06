import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = in.nextInt();
    exp(n,x);
  }
  public static void exp(int n, int x)
  {
    int ans = 1;
	for (int i = x; i != 0; i--)
      ans = ans * n;
    System.out.print(ans);
  }
}
      