package OOP.Interface;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Dog dog1 = new Dog();
    CanRun canRun = dog1;
    dog1 = (Dog) canRun;
    dog1.eat();

    Flyable flyable = new Bird();
    flyable.fly();

  }
}
