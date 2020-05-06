import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = n;
      int c = 0;
      int sum = 0;
	  int power;
      int b;
      while (a != 0)
      {
        a = a/10;
        c++;
      }
      a = n;
      while (a != 0)
      {
        power = a%10;
        b = power;
        for (int i = 1; i < c; i++)
          power = power * b;
        sum = sum + power;
        a = a/10;
      }
      if (sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}