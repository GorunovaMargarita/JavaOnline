package OOP.Box;

public class Box {
    double length;
    double width;
    double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box (Box box1,Box box2) {
        length = box1.length+box2.length;
        width = box1.width+ box2.width;
        height = box1.height + box2.height;
    }
    Box sumBox (Box box) {
        return new Box (length+box.length,width+box.width,height+box.height);
    }
    double volume () {
        return length*height*width;
    }
}
