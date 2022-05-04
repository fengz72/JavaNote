package Java_2.Go01_Thread;

class WindowSync implements Runnable {
    //private static int ticket = 100;
    private int ticket = 100;

    private Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //Object object = new Object();//不能放在这
            synchronized (this) {
            //此时的this是唯一的WindowSync对象
            // synchronized (objects)
            // synchronized (WindowSync.class)
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

public class Sync1 {
    public static void main(String[] args) {
        WindowSync w = new WindowSync();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
