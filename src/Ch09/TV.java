package Ch09;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (on && channel < 120)
            channel += 1;
    }

    public void channelDown(){
        if (on && channel > 1)
            channel -= 1;
    }

    public void volumeUp(){
        if (on && volumeLevel < 7)
            volumeLevel += 1;
    }

    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel -= 1;
    }
}
