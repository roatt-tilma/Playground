import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int list[] = new int[n];
      for (int i = 0; i < n; i++)
      	list[i] = in.nextInt();
      int value = in.nextInt();
      for (int i = 0; i < n-1; i++)
      {
        for (int a = i + 1; a < n; a++)
        {
          int sum = list[i] + list[a];
          if (sum == value)
            System.out.println(list[i] + ", " + list[a]);
        }
      }
    }
}