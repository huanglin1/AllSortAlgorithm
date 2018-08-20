package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/19
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {
    public static int[] mergeSort(int[] arr){
        int [] copyArr= Arrays.copyOf(arr,arr.length);
        int[] temp=new int[arr.length];
        mergeSort(copyArr,0,arr.length-1,temp);
        return copyArr;
    }


    private static void mergeSort(int[] arr,int left,int right,int[] temp){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);

            merge(arr,left,right,temp);
        }
    }


    private static void merge(int[] arr,int left,int right,int[] temp){
        int mid=(left+right)/2;
        int i=left;//左序列
        int j=mid+1;//右序列指针
        int t=0;//临时数组指针
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j])
                temp[t++]=arr[i++];
            else
                temp[t++]=arr[j++];
        }
        while(i<=mid)
            temp[t++]=arr[i++];
        while(j<=right)
            temp[t++]=arr[j++];
        t=0;
        while(left<=right)
            arr[left++]=temp[t++];
    }
}
