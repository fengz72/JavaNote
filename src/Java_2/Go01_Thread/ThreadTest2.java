package Java_2.Go01_Thread;
/**
 * 创建多线程的方式二: 实现Runnable接口
 *
 */

class TwoThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        TwoThread twoThread = new TwoThread();
        Thread t1 = new Thread(twoThread);
        t1.setName("线程1");
        t1.start();

        Thread t2 = new Thread(twoThread);
        t2.setName("线程2");
        t2.start();
    }
}
