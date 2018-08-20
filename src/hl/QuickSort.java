package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/19
 * Time: 19:08
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    public static int[] quickSort(int[] arr){
        int[] arrTemp= Arrays.copyOf(arr,arr.length);
        quickSort(arrTemp,0,arrTemp.length-1);
        return arrTemp;
    }

    private static void quickSort(int[] arr,int left,int right){
        if(left>right)
            return;
        int temp=arr[left];
        int i=left,j=right;
        while(i!=j){
            while(i<j && arr[j]>=temp)
                j--;
            while(i<j && arr[i]<=temp)
                i++;
            if(i<j){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
            }
        }
        arr[left]=arr[i];
        arr[i]=temp;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
