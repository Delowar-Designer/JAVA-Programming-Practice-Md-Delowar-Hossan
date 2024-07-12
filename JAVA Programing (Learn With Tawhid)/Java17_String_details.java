import java.util.Scanner;
public class Java17_String_details
{
  public static void main (String [] args)
 {
    Scanner sc = new Scanner(System.in);
    String s1 = "CSE62826";
    System.out.println(s1.length());
    for(int i=0; i<s1.length(); i++){
      System.out.println(i);
    }
    System.out.println(s1.charAt(2));
    System.out.println(s1.charAt(s1.length()-1));
    for(int i=0; i<s1.length(); i++){
      System.out.println(i+" "+s1.charAt(i));
    }
//    String s2 = sc.nextLine();
//    System.out.println(s2);
//    String s3 = sc.next();
//    System.out.println(s3);
 }
}
