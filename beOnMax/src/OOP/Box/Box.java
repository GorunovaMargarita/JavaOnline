package OOP.Box;

 class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    Box (Box box1,Box box2) {
        length = box1.length+box2.length;
        width = box1.width+ box2.width;
        height = box1.height + box2.height;
    }

     public double getLength() {
         return length;
     }

     public double getWidth() {
         return width;
     }

     public double getHeight() {
         return height;
     }

     Box sumBox (Box box) {
        return new Box (getLength()+box.getLength(),getWidth()+box.getWidth(),
                getHeight()+box.getHeight());
    }
    double volume () {
        return length*height*width;
    }
    void boxInfo () {
        System.out.println("Длина: " + length + "; Высота: " + height + "; Ширина: " + width);
    }
}
