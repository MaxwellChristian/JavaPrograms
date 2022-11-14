package oop;

public class TelevisionTest {

    public static void main(String []args){

        Television tv1 = new Television();
        Television tv2 = new Television();

        tv1.setVolumeLevel(5);
        tv1.setChannel(50);

        tv2.setVolumeLevel(7);
        tv2.setChannel(70);

        // show the television 1
        System.out.println(tv1);

        // show the television 2
        System.out.println(tv2);

    }

}
