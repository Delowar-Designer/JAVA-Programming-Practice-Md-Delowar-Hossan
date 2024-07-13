import java.util.Scanner;
public class Java26_Problem_Solving_in_a_Methods
{
  // access_modifier static return_type/void method_name(parameters)
  
  public static void printEvenNum(int [] a1){
    for(int i=0; i<a1.length; i++){
      if(a1[i]%2==0){
        System.out.println(a1[i]);
      }
    }
//    System.out.println("Welcame to method tutrial");
  }
  
  public static void main (String []args)
 {
    System.out.println("Insid main method");
    int [] arr1 = {11, 12, 34, 56, 67, 77, 44};
    printEvenNum(arr1);
//    greet();
//  myMethod(445, 585);   // methd calling (argumeents)) arguments--> parameters
    
 }
}
