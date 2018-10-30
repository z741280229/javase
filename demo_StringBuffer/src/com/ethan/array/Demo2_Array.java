package com.ethan.array;

public class Demo2_Array {

	/**
	 * * A:������ʾ
			* ����߼����ֲ��Ҵ���
		* B:ע������
			* ����������򣬾Ͳ���ʹ�ö��ֲ��ҡ�
			* ��Ϊ����������ˣ������������ʱ���Ѿ��ı�������ԭʼ��Ԫ��������

	 */
	public static void main(String[] args) {
		int arr[] = new int[] {21,34,45,56};
		System.out.println(getIndex(arr, 67));

	}
	
	// 23   34   45  56 67
	//����88
	//min = 0  3  4  5
	//max = 4  4  4	 4
	//mid = 2  3  4   
	
	public static int getIndex(int[] arr,int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (max + min)/2;
		while(arr[mid] != value ) {
			if(arr[mid] < value) {
				min = mid + 1;
				/*min = mid;
				mid = (min + max) / 2;*/
			}else if(arr[mid] > value) {     
				max = mid - 1;
				/*max = mid;
				mid = (min + max) / 2;*/
			}
			mid = (min + max) / 2;
			
			if(min > max) {
				return -1;
			}
		}
		
		return mid;
	}

}
