import java.sql.SQLOutput;

public class Swicth {
    public static void main(String[] args) {
        main2();
        String Month = "Декабрь";
        String[] Time = {"Winter","Spring","Summer","Autumn"};
        String TimeName="";
        if (Month.equals("Декабрь")|| Month.equals("Январь") || Month.equals("Февраль")) {
            TimeName=Time[0];
        } else if (Month.equals("Март") || Month.equals("Апрель") || Month.equals("Май")) {
            TimeName=Time[1];
        } else if (Month.equals("Июнь") || Month.equals("Июль") || Month.equals("Август")) {
            TimeName=Time[2];
        } else if (Month.equals("Сентябрь") || Month.equals("Октябрь") || Month.equals("Ноябрь")) {
            TimeName = Time[3];
        } else TimeName="Нет такого месяца";
        //System.out.println(TimeName);
    }

    public static void main2() {
        String Month = "Декабрь";
        String[] Time = {"Winter","Spring","Summer","Autumn"};
        String TimeName="";
        switch (Month) {
            case "Январь":
            case "Декабрь":
            case "Февраль":
                TimeName= Time[0];
                break;
            case "Март":
            case "Апрель":
            case "Май":
                TimeName= Time[1];
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                TimeName= Time[2];
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                TimeName= Time[3];
                break;
            default:
                TimeName= "Такого месяца не существует";
        }
        System.out.println(TimeName);
    }
}
