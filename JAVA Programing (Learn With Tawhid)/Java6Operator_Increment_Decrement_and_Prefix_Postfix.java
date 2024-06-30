public class Java6Operator_Increment_Decrement_and_Prefix_Postfix
{
  public static void main(String [] args)
  {
    //Unary operators
    //pre increment ++
    int a = 5;
    int b = ++a;
    System.out.println(a);
    System.out.println(b);
    
    //pre Decrement --
    a = 5;
    b = --a;
    System.out.println(a);
    System.out.println(b);
    
    //Postfix increment ++
    a = 5;
    b = a++;
    System.out.println(a);
    System.out.println(b);
    
    //Postfix Decrement --
    a = 5;
    b = a--;
    System.out.println(a);
    System.out.println(b);
  }
}