package com.ethan.array;

public class Demo1_Array {

	public static void main(String[] args) {
		int[] array = new int[] {21,12,343,354,1} ;
//		bubbleSort(array);
		selectSort(array);
		show(array);
	}

	/*
	 * ð������
	 * 1,����ֵ����,void
	 * 2,�����б�,int[] arr
	 * 
	 * 	��һ��:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3],arr[3]��arr[4]�Ƚ�4��
		�ڶ���:arr[0]��arr[1],arr[1]��arr[2],arr[2]��arr[3]�Ƚ�3��
		������:arr[0]��arr[1],arr[1]��arr[2]�Ƚ�2��
		���Ĵ�:arr[0]��arr[1]�Ƚ�1��
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
	 * ѡ������
	 * 1,����ֵ����void
	 * 2,�����б�int[] arr
	 * 
	 * 	��һ��:arr[0]�ֱ���arr[1-4]�Ƚ�,�Ƚ�4��
		�ڶ���:arr[1]�ֱ���arr[2-4]�Ƚ�,�Ƚ�3��
		������:arr[2]�ֱ���arr[3-4]�Ƚ�,�Ƚ�2��
		���Ĵ�:arr[3]��arr[4]�Ƚ�,�Ƚ�1��
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
