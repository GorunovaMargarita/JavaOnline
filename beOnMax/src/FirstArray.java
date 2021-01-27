public class FirstArray {
    public static void main(String[] args) {
        //массив тип[] имя = new тип[размер];
        int[] DaysInMonth = new int[12];
        DaysInMonth[0] = 31;
        DaysInMonth[1] = 28;
        DaysInMonth[2] = 31;
        DaysInMonth[3] = 30;
        DaysInMonth[4] = 31;
        DaysInMonth[5] = 30;
        DaysInMonth[6] = 31;
        DaysInMonth[7] = 31;
        DaysInMonth[8] = 30;
        DaysInMonth[9] = 31;
        DaysInMonth[10] = 30;
        DaysInMonth[11] = 31;
        int march = DaysInMonth[2];
        //вывод элемента
        //System.out.println(march);
        //вывод массива
        for (int i=0; i < DaysInMonth.length; i++) {
           // System.out.println(DaysInMonth[i]);
        }
        int[] MassNew = new int[100];
        for (int j=0; j < MassNew.length; j++) {
            MassNew[j]=j*10;
        }
        //вывод массива с помощью for
       /* for (int j=0; j < MassNew.length; j++) {
            System.out.println(MassNew[j]);
        }*/
        //цикл for each можно использовать, когда в цикле мы не будем менять массив
        for (int i: MassNew) {
            System.out.println(i);
        }
    }
}
