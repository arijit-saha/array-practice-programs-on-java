package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class SortAccordingEvenOdd {

	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size=KB.nextInt();
		
		int[] arr=new int[size];
		
		System.out.print("Enter the elements : ");
		for(int i=0; i<size; i++) {
			arr[i]=KB.nextInt();
		}
		
		//sorting
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
		//sorting odd even
		int[] arr2=new int[size];
		int[] arr3=new int[size];

		int j=0, k=0;
		for(int i=0; i<arr.length; i++) {
				if(arr[i]%2==0) {
					arr2[j]=arr[i];
					j++;
				}
				else {
					arr3[k]=arr[i];
					k++;
			}
		}
		
		for(int pos:arr2)
			System.out.print(pos+" ");
		System.out.println();
		for(int pos:arr3)
			System.out.print(pos+" ");
		
		/* int[] arr4=new int[size];
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<arr2.length; y++) {
				arr4[x]=arr2[y];
			}
			for(int z=0; z<arr3.length; z++) {
				arr4[x]=arr3[z];
			}
		}
		
		System.out.print("Sorted array is : ");
		for(int pos:arr4)
			System.out.print(pos+" "); */
		
	KB.close();
	}

}
