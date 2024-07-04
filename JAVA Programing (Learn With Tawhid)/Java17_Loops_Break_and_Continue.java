import java.util.Scanner;
public class Java17_Loops_Break_and_Continue
{
  public static void main (String [] args)
 {
    Scanner sc = new Scanner (System.in);
    for(int i=1; i<=10; i++){
      if (i == 6){
        continue;
      }
      System.out.println(i+" Chocolate given");
    }
      
//    for(int i=1; i<=2; i++){
//      for(int j=1; j<=3; j++){
//        System.out.println("j "+j);
//        if (j==2){
//          break;
//        }
//      }
//      System.out.println("Inner loop break hoye giyeche");
//    }
//    System.out.println("Loop er baire");
  
//    int id = sc.nextInt();
//    for (int i=1; i<=10; i++){
//      if (i == id){
//        System.out.println(id+ " My Number");
//        break;
//      }
//      System.out.println(i);
//    }
//    System.out.println("Loop er baire"); 
 }
}
