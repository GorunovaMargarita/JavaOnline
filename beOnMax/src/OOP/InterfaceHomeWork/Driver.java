package OOP.InterfaceHomeWork;

public class Driver extends Employee implements CarDrivable{
  public Driver(String name){
    super(name);
  }

  @Override
  public void carDrive() {
    System.out.println("Drive on Car");
  }
}
