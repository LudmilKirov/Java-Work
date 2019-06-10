package ex10;

import ex11.Task11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] array = {45, 20, 67, 13, 27, 63};

        //Parameters for quick sort and merge sort
        int low=0;
        int high=array.length-1;

        //   int[] selectionSorting = selectionSort(array);
        //   System.out.println(Arrays.toString(selectionSorting));

        //   int[] bubbleSorting=bubbleSort(array);
        //   System.out.println(Arrays.toString(bubbleSorting));

//           int [] insertionSorting=insertionSort(array);
//           System.out.println(Arrays.toString(insertionSorting));

//        int[] shellSorting = shellSort(array);
//        System.out.println(Arrays.toString(shellSorting));

        int[] mergeSorting = mergeSort(array,low,high);
        System.out.println(Arrays.toString(mergeSorting));

//        int[] arraySorting = quickSort(array,low,high);
//        System.out.println(Arrays.toString(arraySorting));



    }

    //45,20,67,13,27,63
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            //set the smallest to be the first
            int smallest = i;
            //go to the end of the array and find the smallest element
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            //Swap the values only if the smallest
            // element is not on the first position
            if (array[i] != array[smallest]) {
                int temp = array[i];
                array[i] = array[smallest];
                array[smallest] = temp;
            }
        }
        return array;
    }

    //45,20,67,13,27,63

    public static int[] bubbleSort(int[] array) {
        boolean flag = true;

        while (flag) {
            //go to the end of the array
            for (int i = 0; i < array.length; i++) {
                //set the flag to false if the flag stay false
                // there is no need to continue the loop and exit
                flag = false;
                for (int j = 0; j < array.length - 1; j++) {
                    //Check the j element and the next and swap them
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        flag = true;
                    }
                }
            }
        }
        return array;
    }

    ///45,20,67,13,27,63
    public static int[] insertionSort(int[] array) {

        int current;
        //Until the end of the array
        for (int i = 1; i < array.length; i++) {
            //Set the current
            current = i;
            //While the current is above zero and if the
            // current is smaller than the before element swap element
            while (current > 0 && array[current] < array[current - 1]) {

                int temp = array[current];
                array[current] = array[current - 1];
                array[current - 1] = temp;

                current--;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println();
        return array;
    }

    ///45,20,67,13,27,63
    public static int[] shellSort(int[] array) {

        //Set a gap that is equal to the array size divided by 2
        //And cycle until gap/2 is bigger than zero
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            //Using this flag to stop the while loop if there is
            // no need to change the order of the elements
            boolean flag = true;

            while (flag) {
                //Set the exit of the loop condition
                flag = false;
                //Until i+gap is less the array length
                for (int i = 0; i + gap < array.length; i++) {
                    //If the array at i position is bigger that
                    // the array at i+gap position - swap them
                    if (array[i] > array[i + gap]) {

                        int temp = array[i];
                        array[i] = array[i + gap];
                        array[i + gap] = temp;

                        flag = true;
                    }
                }
            }
        }
        return array;
    }

    //Recursive merge sort
    //Split until high is bigger than low
    private static  int[] mergeSort(int[] array, int low, int high){

        if(low < high){
            //Set the middle
            int middle = (low + high) / 2;
            //Left array
            mergeSort(array, low, middle);
            //Right array
            mergeSort(array, middle+1, high);
            merge(array, low, middle, high);
        }
        return array;
    }



    private static void merge(int[] array, int low, int middle, int high){
        //Get the two new subarrays
        int leftIndex = middle - low + 1;
        int rightIndex = high - middle;
        int[] left = new int[leftIndex + 1];
        int[] right = new int[rightIndex + 1];
        //Fill the left
        for(int i = 0; i < leftIndex; i++){
            left[i] = array[low + i];
        }
        //Fill the right
        for(int j = 0; j < rightIndex; j++){
            right[j] = array[middle + j + 1];
        }
        //Set the last elements of the array to be Max values
        left[leftIndex] = Integer.MAX_VALUE;
        right[rightIndex] = Integer.MAX_VALUE;

        for(int i = 0,  j = 0,  m = low; m <= high; m++){
            //Get the right order for the right and the left subarrays
            if(left[i] <= right[j]){
                array[m] = left[i++];
            }else{
                array[m] = right[j++];
            }
        }
    }



    //Using the Lomuto partion scheme algorithm
    private static int[] quickSort(int[] array, int low, int high) {
        //If the lowest is less than the highest
        if (low < high) {
            //Get the border
            int border = partition(array, low, high);
            //Get the left
            quickSort(array, low, border-1);
            //Get the right
            quickSort(array, border+1, high);
        }
        return array;
    }

    // moves all n < pivot to left of pivot and all n > pivot
    // to right of pivot, then returns pivot index.
    private static int partition(int[] array, int low, int high) {
        //Set the pivot to the last index
        int pivot=array[high];
        //Border is the first index of the array
        int border = low;
        //From the first index to to last minus 1 ,swap the element on
        // i position and the pivot if the pivot is bigger
        for (int i = border; i < high; i++) {
            if (array[i] < pivot) {
                int temp1 = array[i];
                array[i] = array[border];
                array[border] = temp1;
                border++;
            }
        }
        //swap the lowest and the highest element
        int temp2 = array[border];
        array[border] = array[high];
        array[high] = temp2;

        return border;
    }

}





