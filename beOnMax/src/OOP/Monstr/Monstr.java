package OOP.Monstr;

public class Monstr {
    int eyes;
    int arms;
    int legs;
    int def=2;

    public Monstr(int eyes, int arms, int legs) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
    }

    public Monstr(int eyes, int arms) {
        this.eyes = eyes;
        this.arms = arms;
        legs = def;
    }

    public Monstr(int eyes) {
        this.eyes = eyes;
        arms = def;
        legs = def;
    }

    public Monstr() {
        eyes = def;
        arms = def;
        legs = def;
    }
    static void voice () {
        System.out.println("голос");
    }
    static void voice (int i) {
        for (int j = 0; j < i; j++) {
            voice();
        }
    }
    static void voice (int i,String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
    String MonstrInfo () {
        return "Глаз: " + eyes + "; рук: " + arms + "; ног: " + legs;
    }
}
