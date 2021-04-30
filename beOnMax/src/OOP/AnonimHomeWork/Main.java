package OOP.AnonimHomeWork;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CounterEmployee counterEmployee = new CounterEmployee();
    String report = director.force(counterEmployee,2);
    System.out.println(report);

    String report2 = director.force(new Counter() {
      @Override
      public String report(int monthCount) {
        return "Отчёт за " + monthCount + " месяца!";
      }
    },3);
    System.out.println(report2);
  }
}
