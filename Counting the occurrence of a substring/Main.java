import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   	Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String substr = scan.nextLine();
    int c = 0;
    for (int i = 0; i <= str.length()-substr.length(); i++)
    {
        if (str.substring(i,i+substr.length()).contains(substr))
          c++;
    }
    System.out.print(c);
  } 
}