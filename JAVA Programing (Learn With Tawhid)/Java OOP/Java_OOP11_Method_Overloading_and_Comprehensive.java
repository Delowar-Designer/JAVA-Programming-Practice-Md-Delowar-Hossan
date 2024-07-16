public class Java_OOP11_Method_Overloading_and_Comprehensive
{
  public static void main(String []args)
  {
    myCalculator2 c1 = new myCalculator2();
    System.out.println(c1.add(4, 6));
    System.out.println(c1.add(4, 6, 9));
    System.out.println(c1.add(4.5, 6));
    System.out.println(c1.add(4.5, 6.6));
    System.out.println(c1.add("Mitu", " Joty is Fune Gale"));
  }
}
