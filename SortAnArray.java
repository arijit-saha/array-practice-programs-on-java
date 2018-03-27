package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class SortAnArray {
	
	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=KB.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=KB.nextInt();
		}
		
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("Sorted array is : ");
		for(int pos:arr)
			System.out.print(pos+" ");
		
	KB.close();
	}
}
