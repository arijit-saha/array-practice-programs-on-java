package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class ZigZagArray {

	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=KB.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=KB.nextInt();
		}
		
		System.out.print("Enter the size : ");
		int size2=KB.nextInt();
		
		int[] arr2=new int[size2];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size2; i++) {
			arr2[i]=KB.nextInt();
		}
		
		int[] arr3=new int[size+size2];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			arr3[k]=arr[i];
			k++;
		}
		for(int i=0; i<arr2.length; i++) {
			arr3[k]=arr2[i];
			k++;
		}
		
		System.out.print("Array is : ");
		for(int pos:arr3)
			System.out.print(pos+" ");
		
	KB.close();
	}
}
