import java.util.Scanner;
class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i = 1;
      for(n = n; n != 0; i = i + 2, n = n - 1)
        System.out.println(i);
	}
}