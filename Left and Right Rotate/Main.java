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
    int r = in.nextInt();
    rearrange(list, n, r);
    for (int i = 0; i < n; i++)
      System.out.print(list[i] + " ");
  	}
  public static void rearrange(int list[], int n, int r)
  {
    for(int i = 0; i < r; i++)
    {
      if (n%2 == 0)
      {
        int tempo = list[n-2];
        for (int o = n-2; o >= 2; o = o - 2)
          list[o] = list[o-2];
        list[0] = tempo;
         int tempe = list[1];
        for (int e = 1; e < n-1; e = e + 2)
          list[e] = list[e+2];
        list[n-1] = tempe;
      }
      else
      {
        int tempo = list[n-1];
        for (int o = n-1; o >= 2; o = o-2)
          list[o] = list[o-2];
        list[0] = tempo;
        int tempe = list[1];
        for (int e = 1; e < n-2; e = e + 2)
          list[e] = list[e+2];
        list[n-2] = tempe;
      }   
}
}
}
