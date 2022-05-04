package Java_2.Go01_Thread;

/**
 * 抢票
 * 存在线程安全问题
 */

class Window implements Runnable {
    //private static int ticket = 100;
    private  int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": 卖票，票号为： " + ticket);
                ticket--;
            }else
                break;

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        /**
         * 通过继承Thread类创建线程
         */
//        Window t1 = new Window();
//        Window t2 = new Window();
//        Window t3 = new Window();
//
//        t1.setName("窗口1");
//        t2.setName("窗口2");
//        t3.setName("窗口3");
//
//        t1.start();
//        t2.start();
//        t3.start();
        Window w = new Window();

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
