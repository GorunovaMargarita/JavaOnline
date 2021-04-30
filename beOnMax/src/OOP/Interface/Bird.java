package OOP.Interface;

public class Bird extends Animal implements CanRun,Flyable {
  @Override
  public void eat() {
    System.out.println("Насекомое");
  }

  @Override
  public void run() {
    System.out.println("Птица бежит");
  }

  @Override
  public void fly() {
    System.out.println("Птица летит");
  }
}
