import java.util.Scanner;
public class Java31_Reverse_Integer_Using_Recursion
{
  public static void printRevR(int num){
    if (num == 0){
      return;
    }
    else{
      System.out.println(num);
      printRevR(num-1);
    }
  }
 public static void printRev(int num){
   int count = num;
   while(count > 0){
     System.out.println(count);
     count--;
   }
 }
  public static void main (String []args)
  {
    printRevR(5);
  } 
}
