package OOP.InheritanceHomeWork;

public class Main {
  public static void main(String[] args) {
    Box box = new Box(3,2,1);
    BoxWeight boxWeight = new BoxWeight(5);
    BoxWeight boxWeight1 = new BoxWeight(1,2,3,4);
    box.showInfo();
    boxWeight.showInfo();
    boxWeight1.showInfo();
    box.setHeight(2);
    boxWeight.setHeight(2);
    boxWeight1.setWeight(5);
    box.showInfo();
    boxWeight.showInfo();
    boxWeight1.showInfo();
  }
}
