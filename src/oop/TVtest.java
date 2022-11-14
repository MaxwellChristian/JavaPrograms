package oop;

public class TVtest {

    public static void main(String []args){

        TV tv1 = new TV();
        TV tv2 = new TV();

        TV tv3;
        tv3 = tv1;

        System.out.println("TV 1 : current channel : " + tv1.getChannel());
        System.out.println("TV 2 : current channel : " + tv2.getChannel());

        System.out.println("TV 1 : current volume : " + tv1.getVolumeLevel());
        System.out.println("TV 2 : current volume : " + tv2.getVolumeLevel());

        tv1.setChannel(90);
        tv1.setVolumeLevel(15);

        tv2.setChannel(10);
        tv2.setVolumeLevel(10);

        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeDown();
        tv1.volumeDown();

        tv2.channelDown();
        tv2.channelDown();
        tv2.volumeUp();
        tv2.volumeUp();

        System.out.println("TV 1 : current channel : " + tv1.getChannel());
        System.out.println("TV 2 : current channel : " + tv2.getChannel());

        System.out.println("TV 1 : current volume : " + tv1.getVolumeLevel());
        System.out.println("TV 2 : current volume : " + tv2.getVolumeLevel());

    }

}
