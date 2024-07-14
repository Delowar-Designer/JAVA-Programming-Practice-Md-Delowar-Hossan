public class House
{
  public int window; //instance var
  public int door; //instance var
  
  public void increaseDoor(int dr){
    door = door + dr;
  }
  
  public void view(){   //instance method
    System.out.println(window+" Windows");
    System.out.println(door+" doors");
  }
}
