import java.util.Scanner;
public class Java15_Nested_Loop
{
  public static void main (String [] args)
  {
    for (int outer=1;outer<=2;outer++){
      for(int inner=1;inner<=3;inner++){
        System.out.println(outer+" "+inner);
      }
      System.out.println("Inner loop sesh");
    }
  }
//  {
//    int outer = 1;
//    while(outer<=3){
//      int inner = 1;
//      while (inner<=3){
//        System.out.println(outer+" "+inner);
//        inner += 1;
//    }
//      System.out.println("Inner loop sesh");
//      outer +=1;
//    }
//  }
}