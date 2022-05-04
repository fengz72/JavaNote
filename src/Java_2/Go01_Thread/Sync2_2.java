package Java_2.Go01_Thread;

/**
 * 使用同步方法处理继承Thread类
 */
public class Sync2_2 {
    public static void main(String[] args) {
        WindowSync2_2 t1 = new WindowSync2_2();
        WindowSync2_2 t2 = new WindowSync2_2();
        WindowSync2_2 t3 = new WindowSync2_2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class WindowSync2_2 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show(){//同步监视器：WindowSync2_2
    //private synchronized void show(){//同步监视器：t1, t2, t3
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + ": 卖票，票号为： " + ticket);
            ticket--;
        }
    }
}
