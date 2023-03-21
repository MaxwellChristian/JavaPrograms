package parallel_programming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String []args){

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new ShowValue('A', 100));
        executorService.execute(new ShowValue('B', 100));
        executorService.execute(new ShowValue(100));

        executorService.shutdown();
    }

}
