package OOP.Rect;

public class Main {
  public static void main(String[] args) {
    Rect rect = new Rect();
    rect.setDims(1,2);
    System.out.println("Периметр: " + rect.perimeter());
    System.out.println("Площадь: " + rect.square());
  }
}
