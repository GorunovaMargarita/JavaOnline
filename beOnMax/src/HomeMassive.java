import java.lang.reflect.Field;

public class HomeMassive {
    public static void main(String[] args) {
        int massLength = 0;
        int start =100;
        int finish = 1000;
        for (int i=start; i <= finish; i++) {
            massLength++;
        }
        //System.out.println(massLength);
        int[] First = new int[massLength];
        for (int i=0; i < massLength; i++) {
            First[i] =start+i;
        }
       /* for (int i: First) {
            System.out.println(i);
        }*/
        int[] Second = new int[massLength];
        for (int i = 0, j = First.length - 1; i < First.length; i++, j--) {
                Second[i]=First[j];
            }
        for (int i: Second) {
            System.out.println(i);
        }
    }
}
