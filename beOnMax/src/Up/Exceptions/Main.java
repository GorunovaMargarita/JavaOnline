package Up.Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
       /* try {
            int b = 7/a;
            String s = "1398kjkjkj";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NumberFormatException e1) {
            System.out.println("Ошибка преобразования");
        }*/
        try {
            int b = 7/a;
            String s = "1398kjkjkj";
            //int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NumberFormatException e1) {
            System.out.println("Ошибка преобразования");
        } catch (Exception e) {

        } finally {
            System.out.println("Мы в блоке finally");
        }

        System.out.println("Привет");
    }
}
