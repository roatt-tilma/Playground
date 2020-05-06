import java.util.Scanner;
class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int i = 0; i < arr_size; i++)
        arr[i] = in.nextInt();
      largest(arr_size, arr);
    }
  public static void largest(int arr_size, int arr[])
  {
    int l = 0;
    for (int i = 0; i < arr_size; i++)
    {
      if (arr[i] > l)
        l = arr[i];
    }
    System.out.print(l);
  }
}