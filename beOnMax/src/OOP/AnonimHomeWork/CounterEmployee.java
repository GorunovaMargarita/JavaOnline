package OOP.AnonimHomeWork;

public class CounterEmployee implements Counter{
  @Override
  public String report (int monthCount) {
    return "Отчет за "+ monthCount + " месяцев";
  }
}
