package OOP.Rect;

public class Main {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(10);
    Triangle triangle1 = new Triangle(1,1,1);
    Rect rect = new Rect(10);
    Rect rect1 = new Rect(5,10);
    System.out.println(triangle.square());
    System.out.println(triangle1.square());
    System.out.println(rect.square());;
    System.out.println(rect1.square());

  }
}
