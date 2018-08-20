package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/16
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */

public class BubbleSort {
//    冒泡排序
    static int[] bubbleSort(int[] arr){
        int[] arrTemp=Arrays.copyOf(arr,arr.length);
        int n=arrTemp.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arrTemp[j]>arrTemp[j+1]){
                    int temp=arrTemp[j];
                    arrTemp[j]=arrTemp[j+1];
                    arrTemp[j+1]=temp;
                }
            }
        }
        return arrTemp;
    }
}
