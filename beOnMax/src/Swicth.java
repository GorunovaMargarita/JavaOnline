import java.sql.SQLOutput;

public class Swicth {
    public static void main(String[] args) {
        String Month = "СЕно";
        String[] Time = {"Winter","Spring","Summer","Autumn"};
        String TimeName="";
        if (Month == "Декабрь" || Month == "Январь" || Month == "Февраль") {
            TimeName=Time[0];
        } else if (Month == "Март" || Month == "Апрель" || Month == "Май") {
            TimeName=Time[1];
        } else if (Month == "Июнь" || Month == "Июль" || Month == "Август") {
            TimeName=Time[2];
        } else if (Month == "Сентябрь" || Month == "Октябрь" || Month == "Ноябрь") {
            TimeName = Time[3];
        } else TimeName="Нет такого месяца";
        System.out.println(TimeName);
    }
}
