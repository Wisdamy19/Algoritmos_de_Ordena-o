package ArraySort;

//Selection Sort


public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 8, 4, 9, 16, 5, 12};
        selectionSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    private static void selectionSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length; i++){
            int min = array[i];
            int indexOfmin = i;
            for (int j = i + 1; j < length; j++){
                if (array[j] < min){
                    min = array[j];
                    indexOfmin = j;
                }
            }
            swap(array, i, indexOfmin);
        }
    }
    private static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
