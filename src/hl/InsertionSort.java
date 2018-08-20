package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/16
 * Time: 12:33
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {
    static int[] insertionSort(int[] arr){
        int len=arr.length;
        int[] arrTemp= Arrays.copyOf(arr,len);
        for(int i=1;i<len;i++){
            int current=arrTemp[i];
            int curIndex=i-1;
            while(curIndex>=0 && arrTemp[curIndex]>current){
                arrTemp[curIndex+1]=arrTemp[curIndex];
                curIndex--;
            }
            arrTemp[curIndex+1]=current;
        }
        return arrTemp;
    }
}

