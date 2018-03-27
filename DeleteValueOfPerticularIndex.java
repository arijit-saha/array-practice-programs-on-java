package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class DeleteValueOfPerticularIndex {

	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=KB.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=KB.nextInt();
		}
		
		System.out.print("Which index value you want to delete : ");
		int index=KB.nextInt();
		
		//deleting
		for(int i=index; i<size; i++) {
			arr[i]=arr[i+1];
		}
		size--;
		
		//displaying
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+" ");
		}
	
	KB.close();
	}

}
