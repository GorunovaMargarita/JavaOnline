package OOP.InheritanceHomeWork;

public class BoxWeight extends Box{
  private double weight;


  public BoxWeight(double weight){
    super(2,3,5);
    this.weight = weight;
  }
  public BoxWeight(double length, double width, double height, double weight){
    super(length,width,height);
    this.weight = weight;
  }

  @Override
  public void showInfo(){
    super.showInfo();
    System.out.println("Вес: " + weight+ "\n");
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}
