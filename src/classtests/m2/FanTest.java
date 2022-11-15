package classtests.m2;

public class FanTest {

    public static void main(String []args){

        // Create object for fan 1
        Fan f1 = new Fan();

        // Create object for fan 2
        Fan f2 = new Fan();

        // set the values for fan 1
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("YELLOW");
        f1.setOn(true);

        // set the values for fan 2
        f2.setSpeed(Fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("BLUE");
        f2.setOn(false);

        // as we are printing the object of FAN, the toString() method is automatically called
        System.out.println(f1);
        System.out.println(f2);
    }

}
