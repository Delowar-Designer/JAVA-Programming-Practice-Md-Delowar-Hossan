public class Cat2
{
  public String color;
  public String action = "sitting";
  public int x = 10;
  
  public void changeAction(String action){
    this.action = action;
  }
  
   public void m1(){
     int x = 23;
     System.out.println(x);
     System.out.println(this.x);
  }
   
  public void details(){
    System.out.println(color+" cat is "+action);
    
  }
}