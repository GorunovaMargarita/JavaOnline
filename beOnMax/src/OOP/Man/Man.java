package OOP.Man;

public class Man {
  private String name;
  private String position;
  private int age;
  private double height;

  public String getName() {
    return name;
  }

  public Man withName(String name) {
    this.name = name;
    return this;
  }

  public String getPosition() {
    return position;
  }

  public Man withPosition(String position) {
    this.position = position;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Man withAge(int age) {
    this.age = age;
    return this;
  }

  public double getHeight() {
    return height;
  }
  public Man withHeight(double height) {
    this.height = height;
    return this;
  }

  @Override
  public String toString() {
    return "Man{" +
            "name='" + name + '\'' +
            ", position='" + position + '\'' +
            ", age=" + age +
            ", height=" + height +
            '}';
  }
}
