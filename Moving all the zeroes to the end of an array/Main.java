import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int list[] = new int[n];
      for (int i = 0; i < n; i++)
        list[i] = in.nextInt();
      ae(list, n);
      for (int i = 0; i < n; i++)
        System.out.print(list[i] + " ");
    }
  public static void ae(int list[], int n)
  {
    int c = 0;
    for(int i = 0; i < n; i++)
    {
      if (list[i] != 0)
      {
        list[c] = list[i];
        c++;
      }
    }
    for (int i = c; i < n; i++)
      list[i] = 0;
  }
}