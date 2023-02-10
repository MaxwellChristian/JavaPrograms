package functional_programming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String []args){

        List<String> instructors = new ArrayList<>();

        instructors.add("Alex");
        instructors.add("Maxwell");
        instructors.add("Joe");
        instructors.add("Kelci");
        instructors.add("George");
        instructors.add("Tahmina");

        // manage takes 2 parameters
        // parameter 1: is the collection of values
        // parameter 2: is an operation/action [Consumer]
//        manage(instructors, instructor -> System.out.println(instructor));
        manage(instructors, System.out::println);

        // using the same method to store the name of each instructor to a file
        try (PrintWriter writer = new PrintWriter(new File("instructors.txt"))) {
//            PrintWriter writer = new PrintWriter(new File("files/instructors.txt"));

//            manage(instructors, ins -> writer.println(ins));
            manage(instructors, writer::println);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static <T> void manage(List<T> instructors, Consumer<T> action) {
        for (T instructor: instructors){
            action.accept(instructor);
        }
    }

}
