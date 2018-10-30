package com.ethan.array;

public class Demo2_Array {

	/**
	 * * A:案例演示
			* 数组高级二分查找代码
		* B:注意事项
			* 如果数组无序，就不能使用二分查找。
			* 因为如果你排序了，但是你排序的时候已经改变了我最原始的元素索引。

	 */
	public static void main(String[] args) {
		int arr[] = new int[] {21,34,45,56};
		System.out.println(getIndex(arr, 67));

	}
	
	// 23   34   45  56 67
	//查找88
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
