import java.util.Arrays;
import java.util.Scanner;
public class Java21_Arrays_and_Iterating
{
  public static void main (String [] args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int [] arr1 = new int[size];
    for(int i=0; i<size; i++){
      System.out.println("Enter thee element");
      int elem = sc.nextInt();
      arr1[i] = elem;
    }
    System.out.println(Arrays.toString(arr1));
    
    
//    int [] arr1 = new int [4];
//    int [] arr2 = new int [] {11,33,55,66};
//    int [] arr3 = {11,33,55,66};
//    System.out.println(arr3);
//    System.out.println(Arrays.toString(arr1));
//    System.out.println(Arrays.toString(arr2));
//    System.out.println(Arrays.toString(arr3));
//    String [] arr4 = new String [4];
//    System.out.println(Arrays.toString(arr4));
//    int [] arr5 = {11, 33,55,66,77,8,7};
//    System.out.println(arr5.length);
//    System.out.println(arr5[2]);
//    System.out.println(Arrays.toString(arr5));
//    arr5[2] = 29934;
//    System.out.println(Arrays.toString(arr5));
    
 }
}
