package OOP.EmployeesMass;

import java.util.ArrayList;

public class CollectionHomeWork {
  public static void main(String[] args) {
    int num = 10;
    ArrayList<Integer> nums = new ArrayList<>();
    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> resultList = new ArrayList<>();
    for (int i = 0; i <= num; i++) {
      nums.add(i);
      students.add("Student_" + i);
      resultList.add(nums.get(i) +"-"+ students.get(i));
    }
    for (String result : resultList) {
      System.out.println(result);
    }

  }
}
