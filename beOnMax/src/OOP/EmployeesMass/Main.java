package OOP.EmployeesMass;


public class Main {
  public static void main(String[] args) {
    //примитивный тип
    //int a = 5;
    //ссылочный - использование - это доп. ресурсы. Используйте примитивные везде, где можно
    //Integer a1= 5;
    //Оболочки - использование ссылочного типа вместо примитивного

    /*
    byte c;

    Byte c1;
    short s;
    Short s1;
    long l;
    Long l1;
    char ch;
    Character ch1;
    float f;
    Float f1;
    double d;
    Double d1;
    boolean b;
    Boolean b1;*/
    String s = "1000";
    String test = "2000";
    System.out.println(s+test);
    // Из строки можно получить байт, шорт, инт и даже булеан
    int a = Integer.parseInt(s);
    int b = Integer.parseInt(test);
    System.out.println(a+b);

    String f = "false";
    //true преобразует в true, остальное в false
    boolean bo = Boolean.parseBoolean(f);
    System.out.println(bo);

    String st = "Это Игорь, он программист";
    String name = st.substring(4,9);
    System.out.println(name);
    }

  }
