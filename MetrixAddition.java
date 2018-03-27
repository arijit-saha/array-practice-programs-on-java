package Com.DeepanshuSir.Array;

import java.util.Scanner;

public class MetrixAddition {

	public static void main(String[] args) {
		
		Scanner KB=new Scanner(System.in);
		
		//enter no of rows and columns
		System.out.print("Enter no. of rows : ");
		int row=KB.nextInt();
		System.out.print("Enter no. of column : ");
		int column=KB.nextInt();
		
		int[][] arr1=new int[row][column];
		
		//taking input1
		System.out.println("First metrix");
		System.out.print("Enter the elements : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr1[i][j]=KB.nextInt();
			}	
		}
		
		int[][] arr2=new int[row][column];
		
		//taking input2
		System.out.println("Second metrix");
		System.out.print("Enter the elements : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				arr2[i][j]=KB.nextInt();
			}	
		}
		
		//addition
		int[][] arr3=new int[row][column];
		for(int x=0; x<row; x++) {
			for(int y=0; y<column; y++) {
				arr3[x][y]=arr1[x][y]+arr1[x][y];
			}	
		}
		
		//displaying
		System.out.println("Result metrix");
		for(int x=0; x<row; x++) {
			for(int y=0; y<column; y++) {
				System.out.println(arr3[x][y]);
			}
		}
	KB.close();
	}
}
