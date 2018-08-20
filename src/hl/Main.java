package hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/16
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        int [] test={7,8,9,0,1,4,6,5,3,3,2};
        int[] bubbleSortRes=BubbleSort.bubbleSort(test);
        int [] selectionSortRes=SelectionSort.selectionSort(test);
        int [] insertionSortRes=InsertionSort.insertionSort(test);
        int[] mergeSortRes=MergeSort.mergeSort(test);
        int [] quickSortRes=QuickSort.quickSort(test);
        int [] heapSortRes=HeapSort.heapSort(test);
    }
}
