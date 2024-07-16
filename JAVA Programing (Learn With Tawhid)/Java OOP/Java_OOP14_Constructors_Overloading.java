public class Java_OOP14_Constructors_Overloading
{
  public static void main(String[]args)
  {
    Car c1 = new Car();
    Car c2 = new Car("BMW", "M4");
    Car c3 = new Car("Toyota", "Premio");
    Car c4 = new Car("Audi", "R8", 2024);
    c1.details();
    c2.details();
    c3.details();
    c4.details();
  }
} 