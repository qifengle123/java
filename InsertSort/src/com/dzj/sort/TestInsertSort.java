package com.dzj.sort;

public class TestInsertSort {
	public static void main(String[] args) {
       int arr[] = {5 , 2 , 6 , 0 ,9};
       System.out.println("排序前的数据");
       for(int i = 0; i< arr.length; i++){
    	   System.out.print(arr[i]+" ");
       }
       //直接插入排序
       for(int i = 1;i<arr.length;i++){
    	   int j=i;
    	   //待排序中的元素比已排序的元素小，则交换位置
    	   while(j > 0 && arr[j] < arr[j-1]){
    		   int temp = arr[j];
    		   arr[j] = arr[j-1];
    		   arr[j-1] = temp;
    		   j--;
    	   }
       }
       System.out.println();
       System.out.println("排序后的数组");
       for(int i = 0; i<arr.length; i++){
    	   System.out.print(arr[i]+" ");
       }
	}
}
