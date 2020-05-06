import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int i = 0; i < arr_size; i++)
        arr[i] = in.nextInt();
      int el1 = in.nextInt();
      int el2 = in.nextInt();
      search(el1, arr_size, arr);
      search(el2, arr_size, arr);
    }
  public static void search(int a, int arr_size, int arr[])
  {
   int c = -1;
    for (int i = 0; i < arr_size; i++)
    {
      if (arr[i] == a)
      {
        c = i;
        break;
      }
    }
    System.out.println(c);
  }
}