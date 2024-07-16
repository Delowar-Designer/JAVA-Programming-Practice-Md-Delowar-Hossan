public class Java_OOP12_Constructors
{
  public static void main(String []args)
  {
    Student2 s1 = new Student2("Mitu", 12);
    Student2 s2 = new Student2("Joty", 15);
    Student2 s3 = new Student2();
    Student2 s4 = new Student2("David", 15, 4.9);
    s1.showDetail();
    s2.showDetail();
    s3.showDetail();
    s4.showDetail();
//    Student2 s1 = new Student2();
//    System.out.println(s1);
//    s1 = new Student2();
//    System.out.println(s1);
//    Student2 s2 = new Student2();
//    System.out.println(s2);
//    s1.name = "Bob";
//    s1.id = 11;
//    s2.name = "Carol";
//    s2.id = 33;
//    s1.showDetail();
//    s2.showDetail();
  }
}

