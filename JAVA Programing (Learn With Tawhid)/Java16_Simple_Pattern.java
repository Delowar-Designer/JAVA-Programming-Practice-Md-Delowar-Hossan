import java.util.Scanner;
public class Java16_Simple_Pattern
{
  public static void main (String [] args)
 {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt();
    for(int line=1; line<=num; line++){
      for(int col=1; col<=num; col++){
        System.out.print(col);
      }
      System.out.println();
    }
 }
}