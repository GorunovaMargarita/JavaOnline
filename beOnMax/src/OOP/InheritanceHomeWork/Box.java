package OOP.InheritanceHomeWork;

public class Box {
  private double length;
  private double width;
  private double height;

  public Box(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void showInfo() {
    System.out.println("Длина коробки: " + length + "; ширина коробки: " + width +
                      "; высота коробки: " + height + ". ");
  }

  @Override
  public String toString() {
    String result = String.format("Ширина: %s\nДлина: %s\nДлина: %s", width,length,height);
    return result;
  }
}
