public class Java6LogicalOperators
{
  public static void main(String [] args)
  {
    //Addition Equals
    int num1 = 56;
    //num1 = num1 + 4;
    num1 += 5;
    System.out.println(num1);
    
    //Subtraction Equals
    int sub = 75;
    sub -= 5;
    System.out.println(sub);
      
    //Multiplication Equals
    int num2 = 56;
    //num = num2 + 4;
    num2 *= 5;
    System.out.println(num2);
    
    //Division Equals
    int num3 = 54;
    num3 /= 3;
    System.out.println(num3);
    
    //Modulus Equals
    int num4 = 45;
    num4 %= 4;
    System.out.println(num4);
    
    //Relational Operators
    System.out.println(5 < 3);
    System.out.println(5 > 3);
    System.out.println(5 <= 3);
    System.out.println(5 >= 3);
    System.out.println(5 == 3);
    System.out.println(5 != 5);
    
    //Logical Operators
    // Logical and &&
    System.out.println(5>2 && 6<10);
    // Logical OR ||
    System.out.println(5>2 || 6>10);
    // Logical NOT !
    System.out.println(!(5<2));
    System.out.println(!false);
    System.out.println(!true);
  }
}