package OOP.InterfaceHomeWork;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Driver driver1 = new Driver("Ivan");
    Driver driver2 = new Driver("Vladimir");
    Driver driver3 = new Driver("Anatoliy");
    Programmer programmer1 = new Programmer("Alexei");
    Programmer programmer2 = new Programmer("Andrey");
    Programmer programmer3 = new Programmer("Konstantin");
    Coocker coocker1 = new Coocker("Pavel");
    Coocker coocker2 = new Coocker("Slava");
    Coocker coocker3 = new Coocker("Idris");
    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(driver1);
    employees.add(driver2);
    employees.add(driver3);
    employees.add(programmer1);
    employees.add(programmer2);
    employees.add(programmer3);
    employees.add(coocker1);
    employees.add(coocker2);
    employees.add(coocker3);
    for (Employee employee:employees){
      employee.voice();
    }
    ArrayList<Coockable> coockables = new ArrayList<>();
    coockables.add(coocker1);
    coockables.add(coocker2);
    coockables.add(coocker3);

    for(Coockable coockable: coockables){
      coockable.coock();
    }

    ArrayList<CarDrivable> carDrivables = new ArrayList<>();
    carDrivables.add(driver1);
    carDrivables.add(driver2);
    carDrivables.add(driver3);

    for(CarDrivable carDrivable : carDrivables){
      carDrivable.carDrive();
    }

    ArrayList<WriteCodeable> writeCodeables = new ArrayList<>();
    writeCodeables.add(programmer1);
    writeCodeables.add(programmer2);
    writeCodeables.add(programmer3);

    for (WriteCodeable writeCodeable:writeCodeables) {
      writeCodeable.writeCode();
    }
  }
}
