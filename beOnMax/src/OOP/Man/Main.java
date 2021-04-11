package OOP.Man;

public class Main {
  public static void main(String[] args) {
    String initial = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
    String name = initial.substring(4,8);
    String position = initial.substring(54,65);
    double height = Double.parseDouble(initial.substring(32,37));
    int age = Integer.parseInt(initial.substring(14,16));
    Man man = new Man().withName(name).withAge(age)
                       .withHeight(height).withPosition(position);
    System.out.println(man);
  }
}
