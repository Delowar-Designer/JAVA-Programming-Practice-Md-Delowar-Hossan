import java.util.Scanner;
public class Java27_Methods_Return_Types
{
  public static void adder1(int a, int b){
    int result = a + b;
    System.out.println(result);
  }
  
   public static int adder2(int a, int b){
    int result = a + b;
    return result;
  }
  
  public static void main (String []args)
  {
    adder1(4, 5);
    int ans = adder2(3, 5);
    System.out.println(ans);
  }
}
