public abstract class Vehicule {

  private String brand;
  private int kilometers;

  public Vehicule(String brand, int kilometers) {
      this.brand = brand;
      this.kilometers = kilometers;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getKlm() {
    return this.kilometers;
  }

  public void setKlm(int klm) {
   this.kilometers = klm;
  }

  public abstract String doStuff();

}