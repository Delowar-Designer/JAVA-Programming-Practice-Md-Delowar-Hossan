public class Java_OOP4_Access_and_Modiflcation
{
  public static void main (String []args)
  {
   // Classname variable = new Classname()
    Student s1 = new Student(); //object /instance1
    Student s2 = new Student(); //object /instance2
    s1.name = "Mitu";
    s1.id = "23";
    s2.name = "Joty";
    s2.id = "24";
    s1.standUp();
    s2.standUp();
    s1.showDetail();
    System.out.println("********");
    s2.showDetail();
//    s1.m1(78);
//    System.out.println(s1.name);
//    System.out.println(s1.id);
//    System.out.println(s2.name);
//    System.out.println(s2.id);
//    System.out.println(s1.name+" " +s1.id);
//    System.out.println(s2.name+" " +s2.id);
//    s1 = s2;
//    s1.name = "Developer Delowar";
//    System.out.println(s1.name+" " +s1.id);
//    System.out.println(s2.name+" " +s2.id);
//    System.out.println(s1.name);
//    System.out.println(s1.id);
//    System.out.println(s2.name);
//    System.out.println(s2.id);
  }
} 

