import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if ((ch >= 'a' + key && ch <= 'z') || (ch >= 'A' + key && ch <= 'Z'))
        ch = (char)(ch-key);
      else
        ch = (char)(ch+26-key);
      System.out.print(ch);
    }
}