import java.util.Arrays;
import java.util.Scanner;
public class Java22_Arrays_Understanding_and_Memory_Location
{
  public static void main (String [] args)
 {
    Scanner sc = new Scanner(System.in);
    int [] arr1 = {23, 45, 56, 65};
    int [] arr2 = {423, 35, 5446};
    int [] b;
    arr2 = arr1; // reference wes copied
    b = arr2; // reference wes copied
    b[2] = 885;
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    
    
//    System.out.println(b);
//    System.out.println(arr1);
    
    
    
////    System.out.println(Arrays.toString(arr1));
//    System.out.println(Arrays.toString(b));
    
//    System.out.println(arr1[4]);
//    for(int i=arr1.length-1; i>=0; i--){
//      System.out.println(arr1[i]);
//    }
    
    
//    int i=0;
//    while(i< arr1.length){
//      System.out.println(arr1[i]);
//      i++;
//    }
//    for(int i=0; i< arr1.length; i++){
//      System.out.println(arr1[i]);
//    }
 }
}
