package OOP.Dog;

public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.breed = "Спаниэль";
    dog1.nickname = "Шарик";
    dog1.speed = 4;
    dog1.run();
    System.out.println(dog1.Info());
  }
}
