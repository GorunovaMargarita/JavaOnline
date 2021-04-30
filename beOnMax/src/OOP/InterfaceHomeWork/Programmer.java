package OOP.InterfaceHomeWork;

public class Programmer extends Employee implements WriteCodeable {
  public Programmer(String name){
    super(name);
  }

  @Override
  public void writeCode() {
    System.out.println("Write program code");
  }
}
