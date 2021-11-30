package ch01;
//US population size
public class Ch01_08 {
    public static void main(String[] args){
        int number[]=new int[5];
        int now_number=312032486;
        for(int year=0;year<=4;year++){
            int born=365*24*60/7;//出生人口
            int death=365*24*60/13;//死亡人口
            int in=365*24*60/45;//迁入人口
            int oneyear=born+in-death;
            int totle=year*oneyear+now_number;
            number[year]=totle;
            System.out.println(number[year]);
        }

    }
}
