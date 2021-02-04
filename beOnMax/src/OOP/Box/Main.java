package OOP.Box;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(1,1,1);
        Box box2 = new Box(2,2,2);
        Box box3 = box1.sumBox(box2);
        Box box4 = new Box(box1,box2);
        System.out.println(box1.volume());
        System.out.println(box2.volume());
        System.out.println(box3.volume());
        System.out.println(box4.volume());
    }
}
