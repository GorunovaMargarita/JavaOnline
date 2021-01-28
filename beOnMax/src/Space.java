public class Space {
    public static void main(String[] args) {
        //ещё один способ объявить и указать элементы массива
        int[] DayOfMonts = {31,28,31,30,31};
        for(int i: DayOfMonts) {
            //System.out.println(i);
        }
        String name = "Ivan";
        int age = 33;
        //\n- перенос строки,\" - кавычка
        String result = "Hello, \n" + name + "! You are " + age + " year. \"Ты рад?\"";
        System.out.println(result);
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
        String ListMonth="";
        for (int i=0; i < Month.length; i++) {
            if (i != Month.length-1) {
                ListMonth+=Month[i]+", ";
            } else {
                ListMonth+=Month[i]+".";
            }
        }
       System.out.println(ListMonth);
    }
}
