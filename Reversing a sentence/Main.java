import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int len = sb.length();
      reverse_string(sb,len-1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int end_idx)
    {
      int a = end_idx + 1;
      StringBuilder sb1 = new StringBuilder("");
        for (int i = end_idx; i >= 0; i--)
        {
          if (sb.charAt(i) == ' ')
          {
            sb1.append(sb.substring(i+1,a) + ' ');
            a = i;
          }
        }
      int i = 0;
      while (sb.charAt(i) != ' ')
      {
        sb1.append(sb.charAt(i));
      	i++;
      }
      System.out.print(sb1);
    }
}