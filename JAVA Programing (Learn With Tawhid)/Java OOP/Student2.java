public class Student2
{
  public String name;  //instance variable
  public int id;    //instance variable
  public double cgpa;    //instance variable
  
  public Student2(){
    System.out.println("no parameter I was called");
  }
  public Student2(String name, int id){
    System.out.println("parameter I was called");
    this.name = name;
    this.id = id;
  }
  public Student2(String name, int id, double cgpa){
    System.out.println("Cgpa parameter I was called");
    this.name = name;
    this.id = id;
    this.cgpa = cgpa;
  }
  public void standUp(){    //instance method
    System.out.println(name+" is now standing");
  }
  public void showDetail(){   //instance method
    System.out.println(name+" "+id+" "+cgpa);
  }
}
