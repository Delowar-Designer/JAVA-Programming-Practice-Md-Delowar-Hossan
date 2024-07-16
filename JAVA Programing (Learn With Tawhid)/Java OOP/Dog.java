public class Dog
{
  public String name;
  
  public void eat(String fd){
    System.out.println(name+" is eating "+ fd);
  }
  
  public void eat(String fd, int qn){
    System.out.println(name+" is eating "+qn+" "+fd);
  }
  
   public void eat(String fd, String fd2){
    System.out.println(name+" is eating "+fd+" "+fd2);
  }
   
   public void eat(int fd){
    System.out.println(name+" is eating "+ fd);
  }
   
   public void eat(){
    System.out.println(name+" is eating ");
  }
   
  public void bark(){
    System.out.println(name+" is barking");
  }
}