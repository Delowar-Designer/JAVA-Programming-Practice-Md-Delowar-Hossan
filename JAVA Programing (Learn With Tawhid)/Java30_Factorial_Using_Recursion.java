import java.util.Scanner;
public class Java30_Factorial_Using_Recursion
{
  public static int factorialR(int num){
    if(num == 0) {
      return 1;
    }
    else{
      return num * factorialR(num-1);
    }
  }
  
  public static int factorial(int num){
    int result = 1;
    if (num != 0){
      for(int i=1; i<= num; i++){
        result = result * i;
      }
    }
    return result;
  }
  public static void main (String []args)
  {
    int result = factorialR(4);
    System.out.println(result);
  } 
}
