package Up.ThreadHomeWork;

public class Main {
  static boolean weHaveNumber = false;
  public static void main(String[] args) {
    int a = 0;
    int b = 1000000000;
    int random =  (int)(Math.random()*(b-a) +a);
    System.out.println(random);
    Thread timer1 = new Thread(new Runnable() {
      @Override
      public void run() {
        int i = 0;
        try {
          while (!weHaveNumber) {
            System.out.println(i);
            i++;
            Thread.sleep(1000);
          }
        } catch (Exception e) {
        }
      }
    });
    Thread player = new Thread(new Runnable() {
      @Override
      public void run() {
        while (!weHaveNumber) {
          int guessNumber = (int)(Math.random()*(b-a) +a);
          if(random==guessNumber) {
            weHaveNumber=true;
            System.out.println(random);
          }
        }
      }
    });
    timer1.start();
    player.start();
  }
}
