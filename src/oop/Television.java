package oop;

public class Television {

    final int MIN_CHANNEL = 1;
    private static final int MAX_CHANNEL = 120;

    final int MIN_VOLUME_LEVEL = 1;
    final int MAX_VOLUME_LEVEL = 7;
    int channel;
    int volumeLevel;
    boolean on;

    public Television() {
        channel = MIN_CHANNEL;
        volumeLevel = MIN_VOLUME_LEVEL;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel) {

//        if ( newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL ){

        if ( newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL ){
            this.channel = newChannel;
        }
    }

    public void setVolumeLevel(int newVolumeLevel) {
        if( newVolumeLevel >= MIN_VOLUME_LEVEL && newVolumeLevel <= MAX_VOLUME_LEVEL ){
            this.volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp(){
        if( channel < MAX_CHANNEL ){
            channel++;
        }
    }

    public void channelDown(){
        if( channel > MIN_CHANNEL ){
            channel--;
        }
    }

    public void volumeUp(){
        if( volumeLevel < MAX_VOLUME_LEVEL ){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if( volumeLevel > MIN_VOLUME_LEVEL ){
            volumeLevel--;
        }
    }

    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
