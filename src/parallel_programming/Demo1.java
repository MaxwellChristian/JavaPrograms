package parallel_programming;

// create 3 threads
// thread 1: prints letter 'A' 100 times
// thread 2: prints letter 'B' 100 times
// thread 3: prints numbers 1 to 100

// ways to make your own class with multi-threading capability
// 1. implement runnable
// 2. extend thread

public class Demo1 {

    public static void main(String[] args) {

        // create the tasks
        Runnable r1 = new ShowValue('A', 100);
        Runnable r2 = new ShowValue('B', 100);
        Runnable r3 = new ShowValue(100);

        // create threads with assigned tasks
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        System.out.println("From Main: " + t3.isAlive());
        System.out.println("From Main: " + t3.isInterrupted());

        // start the threads [so that they can work]
//        t1.start();
//        t2.start();
        t3.start();

        System.out.println("From Main: " + t3.isAlive());
        System.out.println("From Main: " + t3.isInterrupted());
    }
}

class ShowValue implements Runnable {

    boolean showLetter;
    private char letter;
    private int repeat;
    public ShowValue(char letter, int repeat) {
        showLetter = true;
        this.letter = letter;
        this.repeat = repeat;
    }

    public ShowValue(int repeat) {
        showLetter = false;
        this.repeat = repeat;
    }

    @Override
    public void run() {

        if( showLetter){
            show(letter, repeat);
        }
        else {
            show(repeat);
        }

    }

    private void show(int repeat) {

        Thread t4 = new Thread(new ShowValue('C', 400));
        t4.start();


        for (int i = 0 ; i < repeat ; i++) {
            System.out.print( (i+1) + " ");

            // yield temporarily releases time for other threads
            // Thread.yield();

//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            if(i >= repeat/2){
                try {
                    t4.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void show(char letter, int repeat) {
        for (int i = 0 ; i < repeat ; i++) {
            System.out.print( letter + " ");
        }
    }
}
