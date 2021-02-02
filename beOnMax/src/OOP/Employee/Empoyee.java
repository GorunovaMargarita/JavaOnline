package OOP.Employee;

public class Empoyee {
    String name;
    String position;
    int salary;

    public Empoyee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    String info (int month) {

        return "Сотрудник " + name + ", должность \"" + position + "\", за последние " + month +
                " месяцев получил " + month * salary + " рублей.";
    }
}
