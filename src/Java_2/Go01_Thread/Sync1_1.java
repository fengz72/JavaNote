package Java_2.Go01_Thread;


class WindowSync1_1 extends Thread {
    //private static int ticket = 100;
    private static int ticket = 100;

    private static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //Object object = new Object();//不能放在这
            synchronized (object) {
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + ": 卖票，票号为： " + ticket);
                    ticket--;
                } else
                    break;

            }
        }
    }
}

public class Sync1_1 {
    public static void main(String[] args) {
        WindowSync1_1 t1 = new WindowSync1_1();
        WindowSync1_1 t2 = new WindowSync1_1();
        WindowSync1_1 t3 = new WindowSync1_1();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}