public class Car
{
  public String brand;            
  public String model;
  public int year;
  
  public Car(){
    System.out.println("I wos called");
  }
  
  public Car(String brd, String md){
    brand = brd;
    model = md;
  }
  
  public Car(String brd, String md, int yr){
    brand = brd;
    model = md;
    year = yr;
  }
  
  public void details(){
    System.out.println(brand+" "+model+" "+year);
  }
}
