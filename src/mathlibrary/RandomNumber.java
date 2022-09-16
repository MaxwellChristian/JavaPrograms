package mathlibrary;

public class RandomNumber {

    public static void main(String[] args){

        double rNumber;

        // generates a random double value from 0.0 <= value < 1.0
        rNumber = Math.random();
        System.out.println(rNumber);

        // generate a random number upto 20 [whole numbers]
        rNumber = (int)(Math.random() * 20);
        System.out.println(rNumber);

        // generate a random number between X and Y i.e. x <= value < Y
        // between 20 and 40
        rNumber = 20 + (int)(Math.random() * (40-20));
        System.out.println(rNumber);

    }

}
