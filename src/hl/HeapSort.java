package hl;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/8/19
 * Time: 20:12
 * To change this template use File | Settings | File Templates.
 */
public class HeapSort {
    public static int[] heapSort(int[] arr){
        int[] arrTemp= Arrays.copyOf(arr,arr.length);

        //1、构建大顶堆
        for(int i=arrTemp.length/2-1;i>=0;i--){
            //从第一个非叶子节点从下至上，从右至左调整结构
            adjustHeap(arrTemp,i,arrTemp.length);
        }

        //2、调整堆结构+交换堆顶元素与末尾元素
        for(int j=arrTemp.length-1;j>0;j--){
            swap(arrTemp,0,j);
            adjustHeap(arrTemp,0,j);
        }
        return arrTemp;
    }


    //调整大顶堆，（仅是调整过程，建立在大顶堆已构建的基础上）
    private static void adjustHeap(int[] arr,int i,int length){
        int temp=arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k<length-1 && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k]>temp){//如果子节点大于父节点，将子节点赋给父节点（不用进行交换）
                arr[i]=arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;//将temp值放到最终的位置
    }


    //交换元素
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}