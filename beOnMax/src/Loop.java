public class Loop {
    public static void main(String[] args) {
        //цикл for используется, когда надо что-то выполнить несколько раз
        for (int i = 100; i <= 1000; i++) {
            if ((i % 2 !=0) && (i % 5 == 0 )) {
                System.out.println(i);
            }
        }

    }
        /*//вывод только чётных чисел
        int i=1000;
        //цикл while (условие) {что делать}
        while (i>=0) {
            //если остаток от деления на 2 равен 0, то...
            if(i % 2==0) {
                System.out.println(i);
            }
            i--;
            //a++ - операция инкремента, увеличивает значение на 1 и присваивает переменной;
            //a-- - операция декремена, уменьшает значение на 1 и присваивает переменной;
            //условный оператор if(условие)
           /* if (a==5) {
                //прерывает выполнение цикла
                break;
            }*/
                /* //расчёт среднего
        int count=1;
        int sum=0;
        while (count<=100) {
            sum+=count;
            count++;
        }
        float result=sum/(float)count;
        System.out.println(result);*/
        //цикл do {что делаем} while (условие) Этот цикл выполняется хотябы 1 раз в отличие от while
        /*int a=0;
        do {
            System.out.println("Привет");
        }
        while (a > 0);
        } */
    }

