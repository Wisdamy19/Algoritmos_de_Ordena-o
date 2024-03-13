package ListSort;

import java.util.ArrayList;

public class QuickSort {
    public static void main(String[] args) {
        int n = 8;
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(4);
        System.out.println(list);
        quickSort(list, 0, list.size() - 1);
        System.out.println("==============================");

        System.out.println(list);
    }
    private static void quickSort(ArrayList<Integer> list, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){
            return;
        }
        int pivot = list.get(highIndex);

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (list.get(leftPointer) <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (list.get(rightPointer) >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(list, leftPointer, rightPointer);
        }
        swap(list, leftPointer, highIndex);

        quickSort(list, lowIndex, leftPointer - 1);
        quickSort(list,leftPointer + 1, highIndex);
    }
    private static void swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }
}