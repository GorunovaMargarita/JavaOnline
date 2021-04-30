package OOP.InterfaceHomeWork;

public class Coocker extends Employee implements Coockable {
  public Coocker(String name){
    super(name);
  }

  @Override
  public void coock() {
    System.out.println("I am coock");
  }
}
