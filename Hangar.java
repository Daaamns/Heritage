public class Hangar {
  
  public static void main(String[] args) {
    Car telsa = new Car("Tesla", 0);
    Boat jetski = new Boat("un jet ski sa mere", 10);
    System.out.println(telsa.doStuff());
    System.out.println(jetski.doStuff());
  }
}