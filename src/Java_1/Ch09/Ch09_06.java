package Ch09;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Ch09_06 {
    public static void main(String[] args){
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];
        stopWatch.start();
        for (int i = 0; i < 100000; i++){
            numbers[i] = new Random().nextInt(1000000);
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
        stopWatch.start();
        Arrays.parallelSort(numbers);
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}

class StopWatch{
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = new Date().getTime();
    }

    public void start(){
        startTime = new Date().getTime();
    }

    public void end(){
        endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}