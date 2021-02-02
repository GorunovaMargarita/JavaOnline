package OOP.Dog;

public class Dog {
  String nickname;
  String breed;
  int speed;
  void run () {
    String runs="";
    for (int i = 0; i < speed; i++) {
      runs +="бегу";
      if (i == speed-1)
        runs+=".";
      else runs += ", ";
    }
    System.out.println(runs);
  }
  String Info () {
    return "Кличка: " + nickname + "; порода: " + breed + "; скорость: " + speed + ".";
  }
}
