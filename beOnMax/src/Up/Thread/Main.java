package Up.Thread;

public class Main {
    public static void main(String[] args) {
        //RunnableTimer runnableTimer = new RunnableTimer();
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while () {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer.start();

    }
}
