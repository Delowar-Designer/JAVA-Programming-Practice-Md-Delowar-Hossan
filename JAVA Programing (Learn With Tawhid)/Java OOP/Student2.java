public class Student2
{
  public String name;  //instance variable
  public int id;    //instance variable
  
  public Student2(String name, int id){
    System.out.println("I was called");
    this.name = name;
    this.id = id;
  }
  public void standUp(){    //instance method
    System.out.println(name+" is now standing");
  }
  public void showDetail(){   //instance method
    System.out.println(name+" "+id);
  }
}
