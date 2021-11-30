package Ch09;

public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(5);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1: " + tv1.channel + " " + tv1.volumeLevel);
        System.out.println("tv2: " + tv2.channel + " " + tv2.volumeLevel);
    }
}
