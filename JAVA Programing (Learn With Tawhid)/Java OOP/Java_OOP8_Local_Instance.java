public class Java_OOP8_Local_Instance
{
  public static void main(String [] args)
  {
    Cat2 c1 = new Cat2();
    //c1.m1();
    //System.out.println(c1);
    c1.color = "white";
    Cat2 c2 = new Cat2();
    c2.color = "Purple";
    System.out.println("c1 =======");
    c1.details();
    System.out.println("c2 =======");
    c2.details();
    c1.changeAction("Jumping");
    System.out.println("c1 =======");
    c1.details();
  }
}