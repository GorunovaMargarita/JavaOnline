package OOP.Rect;

public class Rect {
  double weight;
  double length;
  void setDims (double weight,double length) {
    this.weight = weight;
    this.length = length;
  }
  double perimeter () {
    return 2.0 * (weight + length);
  }
  double square () {
    return weight * length;
  }
}
