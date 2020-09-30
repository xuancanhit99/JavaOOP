package ru.mirea.canh.test;

//An interface used to compare two objects.
import java.lang.Comparable;

public class Sorting {

    /*Set this to "false" to turn off display*/
    public static Boolean display = true;

    /**
     * main method starts the program

     * @param args must be Integers only
     */
    public static void main(String args[]) {
        // selectionSort
        Integer[] array = Sorting.arrayCopy(args);
        // quickSort
        array = arrayCopy(args);
        System.out.println("quickSort");
        Sorting.quickSort(array);
        Sorting.print(array);
        System.out.println();
    }//end of main

    /**
     * quick sort
     *
     * @param array is an array of Comparable objects
     */
    public static void quickSort(Comparable[] array) {
        //overloading: two methods with same name, but different parameter type and/or count
        //calls quickSort method with 3 parameters
        Sorting.quickSort(array, 0, array.length-1);
    }

    /**
     * quick sort
     *
     * @param array is an array of Comparable objects
     * @param start is the first element in the array
     * @param end is the last element in the array
     */
    public static void quickSort(Comparable[] array, int start, int end) {
        if (start < end) {
            // split the table into two parts
            int pivot = Sorting.partition(array, start, end);
            // sort the two parts
            Sorting.quickSort(array, start, pivot - 1);
            Sorting.quickSort(array, pivot + 1, end);
        }
    }

    /**
     * partitions the array into two parts: smaller or greater/equal part
     *
     * @param array is an array of Comparable objects
     * @param start is the first element in the array
     * @param end is the last element in the array
     * @return the index of the partition element
     */
    private static int partition(Comparable[] array, int start, int end) {
        //display array before partition
        if(Sorting.display){
            Sorting.print(array, start, end);
        }
        // get pivot item (1st item)
        Comparable pivot = array[start];
        //display pivot
        if(Sorting.display){
            System.out.println("pivot=" + pivot);
        }
        // index of end element in smaller part
        int split = start;
        // loop from 2nd element to end of array
        for (int i = start + 1; i <= end; i++) {
            // split elements in smaller part or greater/equal part
            // if pivot is greater than array[i]
            // then swap array[i], so it is in the smaller part
            if (pivot.compareTo(array[i]) > 0) {
                //increase size of smaller part
                split = split + 1;
                //swap, so item is in smaller part
                Comparable temp = array[i];
                array[i] = array[split];
                array[split] = temp;
                //display swapped numbers
                if(Sorting.display){
                    System.out.println("swap " + array[split] + " and " + array[i]);
                }
            }
        }
        // swap pivot with last element in smaller part
        // so pivot is between the two parts
        array[start] = array[split];
        array[split] = pivot;
        //display swapped numbers
        if(Sorting.display){
            System.out.println("swap " + array[split] + " and " + pivot);
            Sorting.print(array, start, end);
        }
        return split;
    }

    /**
     * prints out an array from start index to ending index
     *
     * @param array is an array of Comparable objects
     */
    public static void print(Comparable[] array){
        //overloading: two methods with same name, but different parameter type and/or count
        //calls print method with 3 parameters
        Sorting.print(array, 0, array.length-1);
    }

    /**
     * prints out an array from start index to ending index
     *
     * @param array is an array of Comparable objects
     * @param start is the first element in the array
     * @param end is the last element in the array
     */
    public static void print(Comparable[] array, int start, int end) {
        for (int i = 0; i < array.length; i++) {
            if(i>=start && i<=end){
                System.out.print(array[i] + ", ");
            }
            else{
                //display blanks for proper placement of elements
                System.out.print("   ");
            }
        }
        System.out.println();
    }

    /**
     * copies and converts an array of Strings to an array of Integers
     *
     * @param array is an array of Strings
     * @return an array of Integers
     */
    public static Integer[] arrayCopy(String[] array) {
        Integer[] array2 = new Integer[array.length];
        try{
            for (int i = 0; i < array.length; i++) {
                array2[i] = Integer.parseInt(array[i]);
            }
        }
        catch(NumberFormatException error){
            System.out.println("ERROR: Commandline args must be Integers!");
            System.exit(1);
        }
        return array2;
    }//end of method

}//end of class

