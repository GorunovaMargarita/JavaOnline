public class MonthMass {
    public static void main(String[] args) {
        int MonthNumber=12;
        String MonthResult;
        String[] Month = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        if (MonthNumber > 0 && MonthNumber <= Month.length) {
            MonthResult=Month[MonthNumber-1];
        } else MonthResult="Такого месяца не существует";

        System.out.println(MonthResult);
    }
}
