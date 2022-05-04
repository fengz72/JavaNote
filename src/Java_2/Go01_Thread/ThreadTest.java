package Java_2.Go01_Thread;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("MyThread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();//1.启动当前线程；2.调用当前线程的run（）.


        //创建Thread类的匿名子类
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++){
//                    if (i % 2 != 0){
//                        System.out.println(getName() + " : " + getPriority() + " : " + i);
//                    }
//                }
//            }
//        }.start();

        //主线程
        Thread.currentThread().setName("main");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 100; i++){
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority() + " : " + i);
            }
        }
    }
}
