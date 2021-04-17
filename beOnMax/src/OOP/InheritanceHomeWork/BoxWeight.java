package OOP.InheritanceHomeWork;

public class BoxWeight extends Box{
  private double weight;

  public BoxWeight(double weight){
    super(2,3,5);
    this.weight = weight;
  }
  @Override
  public void showInfo(){
    super.showInfo();
    System.out.println("Вес: " + weight);
  }
}
