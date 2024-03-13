package ArraySort;

//Quick Sort

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {8, 3, 5, 9, 2, 1, 3, 4};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    private static void quickSort(int[] array, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){
            return;
        }
        int pivot = array[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer <= rightPointer){
            while (array[leftPointer] <= pivot && leftPointer <= rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && rightPointer >= leftPointer){
                rightPointer--;
            }
            if (leftPointer < rightPointer){
                swap(array, leftPointer, rightPointer);
            }
        }
        swap(array, leftPointer, highIndex);

        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array,leftPointer + 1, highIndex);
    }
    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }
}