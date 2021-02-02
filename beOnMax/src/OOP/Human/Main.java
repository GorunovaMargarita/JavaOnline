package OOP.Human;

public class Main {
  public static void main(String[] args) {
    double middleAge;
    int humanCount = 5;
    Human first = new Human();
    Human second = new Human();
    Human third = new Human();
    Human fourth = new Human();
    Human fifth = new Human();
    first.name="Иван";
    first.height=160;
    first.yearsOld=12;
    second.name="Артур";
    second.height=190;
    second.yearsOld=27;
    third.name="Мария";
    third.height=170;
    third.yearsOld=25;
    fourth.name="Жорж";
    fourth.height=125.5;
    fourth.yearsOld=8;
    fifth.name="Анна";
    fifth.height=160;
    fifth.yearsOld=50;
    Human[] humans = new Human[humanCount];
    humans[0] = first;
    humans[1] = second;
    humans[2] = third;
    humans[3] = fourth;
    humans[4] = fifth;
    double sum = 0.0;
    for (int i = 0; i < humans.length; i++) {
      sum+=humans[i].yearsOld;
    }
    middleAge = sum/humanCount;
    System.out.println("Средний возраст: " + middleAge);
    middleAge=(first.yearsOld + second.yearsOld + third.yearsOld + fourth.yearsOld + fifth.yearsOld)/humanCount;
    System.out.println("Средний возраст: " + middleAge);
  }
}
