package OOP.EmployeesMass;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetClass {
  public static void main(String[] args) {
    //только уникальные элементы
    HashSet<String> names = new HashSet<>();
    names.add("Джон");
    names.add("Дик");
    names.add("Док");
    names.add("Дим");
    names.add("Дизз");
    names.add("Ольга");
    names.add("Ольга");
    //только в таком цикле можем обращаться к элементам
    //порядок элементов меняется
    for(String name: names){
      //System.out.println(name);
    }
    //те же особенности, что и у хэш, но данные хранятся в отсортированном виде
    //выводит по возрастанию
    TreeSet<String> names2 = new TreeSet<>();
    names2.add("1");
    names2.add("2");
    names2.add("3");
    names2.add("Дим");
    names2.add("8");
    names2.add("Ольга");
    names2.add("Ольга");
    //только в таком цикле можем обращаться к элементам
    //порядок элементов меняется
    for(String name: names2){
      System.out.println(name);
    }

  }
}
