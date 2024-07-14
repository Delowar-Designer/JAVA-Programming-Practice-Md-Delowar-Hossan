import java.util.Scanner;
public class Java29_Recursion
{
  public static int sumNumR(int num){
    if(num == 1){
      return 1;
    }
    else{
      return num + sumNumR(num-1);
    }
  }
  public static void sumNum(int num){
    int total = 0;
    for (int i=1; i<=num; i++){
      total += i;
    }
    System.out.println(total);
  }
  public static void main (String []args)
  {
//    sumNum(5);
    int result = sumNumR(5);
    System.out.println(result);
  } 
}
