package sorting_algorithms;

public class InsertionSortDemo {

    public static void main(String[] args) {

        // values to sort
        int[] values = {10, 8, 9, 199, 90, -1, 2};

        // display the values [before sorting]
        System.out.print("Before sorting: ");
        showValues(values);
        System.out.println();

        // sort the values using insertion sort
        insertionSort(values);

        // display the sorted values
        System.out.print("After sorting:  ");
        showValues(values);
        System.out.println();
    }

    private static void showValues(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

    private static void insertionSort(int[] values) {

        for (int right = 1; right < values.length; right++) {

            int currentValue = values[right];
            int left;

            for (left = right - 1; left >= 0 && values[left] > currentValue; left--) {
                values[left + 1] = values[left];
            }

            values[left + 1] = currentValue;

            System.out.print("In sorting:  ");
            showValues(values);
            System.out.println();
        }
    }

}
