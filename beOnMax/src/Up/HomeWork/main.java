package Up.HomeWork;

public class main   {
    public static void main(String[] args) {
        int [] mass = new int[3];
        try {
            mass[1] = 1;
            mass[2] = 2;
            mass[3] = 3;
            //mass[4] = 4;
           /* for (int i : mass) {
                System.out.println(i);
            }*/
            for (int i = 0; i < 10; i++ ) {
                System.out.println(mass[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Такого элемента не существует");
        }

    }
}
