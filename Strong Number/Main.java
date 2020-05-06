import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      int sum = 0;
      int fact = 1;
      while (n != 0)
      {
        fact = 1;
        for (int i = 2; i <= (n%10); i++)
          fact = fact * i;
        sum = sum + fact;
        n = n/10;
      }
      if (num == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}