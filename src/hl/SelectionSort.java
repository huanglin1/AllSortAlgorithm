package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/16
 * Time: 11:20
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort {
    public static int [] selectionSort(int[] arr){
        int [] arrTemp= Arrays.copyOf(arr,arr.length);
        int len=arrTemp.length;
        for(int i=0;i<len-1;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(arrTemp[j]<arrTemp[minIndex])
                    minIndex=j;
            }
            int temp=arrTemp[i];
            arrTemp[i]=arrTemp[minIndex];
            arrTemp[minIndex]=temp;
        }
        return arrTemp;
    }
}
