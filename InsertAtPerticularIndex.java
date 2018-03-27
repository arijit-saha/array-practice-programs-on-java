package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class InsertAtPerticularIndex {

	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=KB.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=KB.nextInt();
		}
		
		System.out.print("Which index value you want to add : ");
		int index=KB.nextInt();
		System.out.print("Enter the value : ");
		int val=KB.nextInt();
		
		//creating new array
		int[] arr2=new int[size+1];
		
		//adding
		int j=0;
		for(int i=0; i<index; i++) {
			arr2[j]=arr[i];
			j++;
		}
		arr2[j]=val;
		j++;
		for(int i=index; i<arr.length; i++) {
			arr2[j]=arr[i];
			j++;
		}
		
		//displaying
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	KB.close();	
	}
}
