public class Java_OOP9_Calculator_Return_from
{
  public static void main(String []args)
  {
    myCalculator c1 = new myCalculator();
    //Case -1 
    c1.add1(4, 5);
    //Case - 2
    int ans = c1.add2(4, 6);
    System.out.println(ans);
    System.out.println("===========");
    //Case-3
    System.out.println(c1.add2(3,5));
    
  }
}
