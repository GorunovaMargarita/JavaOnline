package Up.StringFormatHomeWork;

public class Main {
    public static void main(String[] args) {
        int a =10;
        int b = 100;
        int random = (int)(Math.random()*(b-a) +a);
        System.out.println(String.format("Случайное число %s. Попробуйте еще раз",random));
    }
}
