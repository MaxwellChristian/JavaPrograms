package recursion;

public class ShowListValues {

    public static void main(String []args){

        int []values = {10, 20, 30, 40, 50};

        showValues(values);
        System.out.println();

        showValuesRecursive(values, 0);
        System.out.println();

        showValuesReverseRecursive(values, 0);
        System.out.println();

    }

    private static void showValuesReverseRecursive(int[] values, int indexToWork) {

        if( indexToWork < values.length ){

            // recursive call with incremented index
            showValuesReverseRecursive(values, indexToWork+1);

            // display the value at index
            System.out.print(values[indexToWork]);
            System.out.print(", ");
        }

    }

    private static void showValuesRecursive(int[] values, int indexToWork) {

        if( indexToWork < values.length ){

            // display the value at index
            System.out.print(values[indexToWork]);
            System.out.print(" ");

            // recursive call with index incremented
            showValuesRecursive(values, indexToWork+1);
        }

    }

    private static void showValues(int[] values) {
        for(int index = 0 ; index < values.length ; index++){
            System.out.print(values[index]);
            System.out.print(" ");
        }
    }

}













