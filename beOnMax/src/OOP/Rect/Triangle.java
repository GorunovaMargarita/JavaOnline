package OOP.Rect;

public class Triangle extends Figure {
  private double c;

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public Triangle(double size) {
    super(size,size);
    this.c = size;
  }
  public Triangle(double a, double b,double c) {
    super(a,b);
    this.c = c;
  }

  @Override
  public double square() {
    double perimeterHalf = (getA() + getB() + c)*0.5;
    return Math.sqrt(perimeterHalf*(perimeterHalf-getA())
                    *(perimeterHalf- getB())*(perimeterHalf- c));
  }
}
