package OOP.EmployeesMass;

import java.util.ArrayList;


public class Collection {
  public static void main(String[] args) {
    //можно хранить всё подряд, если нет <>
    ArrayList<String> employees = new ArrayList<>();
    employees.add("Сергей");
    employees.add("Андрей");
    employees.add("Жук");
    employees.remove("Сергей");
    for (String name : employees){
      System.out.println(name);
    }
    //можно создавать ArrayList любых но только ссылочных типов
    //Всегда ArrayList вместо массива
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int i = 0; i< 1000; i++) {
      numbers.add(i);
    }
    int sum = 0;
    for (int i : numbers){
      sum += i;
    }
    System.out.println(sum);
  }

}
