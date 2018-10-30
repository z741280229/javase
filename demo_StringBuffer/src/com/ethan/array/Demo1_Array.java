package com.ethan.array;

public class Demo1_Array {

	public static void main(String[] args) {
		int[] array = new int[] {21,12,343,354,1} ;
//		bubbleSort(array);
		selectSort(array);
		show(array);
	}

	/*
	 * 冒泡排序
	 * 1,返回值类型,void
	 * 2,参数列表,int[] arr
	 * 
	 * 	第一次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3],arr[3]与arr[4]比较4次
		第二次:arr[0]与arr[1],arr[1]与arr[2],arr[2]与arr[3]比较3次
		第三次:arr[0]与arr[1],arr[1]与arr[2]比较2次
		第四次:arr[0]与arr[1]比较1次
	 */
	public static void bubbleSort(int[] arr) {
		int temp = arr[0];
		for(int i = 0; i < arr.length-1;i++) {
			for(int j = 0; j < arr.length - 1 - i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	/*
	 * 选择排序
	 * 1,返回值类型void
	 * 2,参数列表int[] arr
	 * 
	 * 	第一次:arr[0]分别与arr[1-4]比较,比较4次
		第二次:arr[1]分别与arr[2-4]比较,比较3次
		第三次:arr[2]分别与arr[3-4]比较,比较2次
		第四次:arr[3]与arr[4]比较,比较1次
	 */
	public static void selectSort(int arr[]) {
		int temp = 0;
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void show(int[] arr) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
