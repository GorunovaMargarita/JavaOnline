package OOP.Monstr;

public class Main {
    public static void main(String[] args) {
        Monstr monstr1 = new Monstr();
        Monstr monstr2 = new Monstr(1);
        Monstr monstr3 = new Monstr(2,3);
        Monstr monstr4 = new Monstr(4, 5,6);
        System.out.println(monstr1.MonstrInfo());
        System.out.println(monstr2.MonstrInfo());
        System.out.println(monstr3.MonstrInfo());
        System.out.println(monstr4.MonstrInfo());
        Monstr.voice();
        Monstr.voice(3,"Рита");
        Monstr.voice(2);

    }
}
