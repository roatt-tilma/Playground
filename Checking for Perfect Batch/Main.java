import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for (int i = 0; i < n; i++)
      list[i] = in.nextInt();
    int sum = list[0] + list[1] + list[2]; 
    for (int i = 3; i < n; i = i+3)
    {
      if (list[i] + list[i+1] + list[i+2] != sum)
      {
        sum = 0;
        break;
      }
    }
    if (sum == 0)
      System.out.print("Not a Perfect Batch");
    else
      System.out.print("Perfect Batch");
  }
}