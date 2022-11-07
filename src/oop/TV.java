package oop;

public class TV {

    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {

        this.channel = 1;
        this.volumeLevel = 1;

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {

        if( newChannel >= 1 && newChannel <= 120){
            this.channel = newChannel;
        }

    }

    public void setVolumeLevel(int newVolumeLevel) {
        this.volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        if(this.channel < 120){
            this.channel++;
        }
    }

    public void channelDown() {
        if( this.channel > 1){
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volumeLevel++;
    }

    public void volumeDown() {
        this.volumeLevel--;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }
}
