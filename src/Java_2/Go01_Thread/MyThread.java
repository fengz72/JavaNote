package Java_2.Go01_Thread;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run() -->将此线程执行的操作声明在此方法中
 * 3.创建Thread类子类的对象
 * 4.通过此对象调用start（）
 */

/**
 * Thread方法
 * sleep(mills)
 */

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println(getName() + " : " + getPriority() + " : " + i);
            }

//            if (i % 20 == 0){
//                yield();
//            }
        }
    }

}
