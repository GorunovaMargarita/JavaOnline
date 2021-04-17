package OOP.Inheritance;

public class Leon extends CatFamily{
  public Leon(){
    super(2,4,true);
  }

  @Override
  public void eat() {
    super.eat();
    System.out.println("антилопу");
  }
}
