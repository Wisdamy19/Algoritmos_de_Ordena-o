package ArraySort;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {23, 42, 38, 12, 5, 18, 44, 21};
        mergeSort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    private static void mergeSort(int[] array){
        int length = array.length;
        if (length <= 1) return; // caso base

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // left array
        int j = 0; // right array

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, l = 0, r = 0;

        // Checar condições para o merge

        while(l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i++] = leftArray[l++];
            }
            else {
                array[i++] = rightArray[r++];
            }
        }
        while (l < leftSize){
            array[i++] = leftArray[l++];
        }
        while (r < rightSize){
            array[i++] = rightArray[r++];
        }
    }
}
