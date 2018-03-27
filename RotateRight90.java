package Com.DeepanshuSir.Array;

import java.util.Scanner;

class RotateRight90 {
	
	public static void main(String[] args) {
		Scanner KB=new Scanner(System.in);
        System.out.print("Enter number of row : ");  
        int row=KB.nextInt();
        System.out.print("Enter number of coulmn : ");
        int column=KB.nextInt();
        
        //creating an array
        int[][] arr=new int[row][column];
        
        //initialization of array
        System.out.println("Enter array elements : ");
        for(int i=0;i<row;i++) {
        	for(int j=0;j<column;j++) {
        		arr[i][j]=KB.nextInt();
        	}
        System.out.println();
        }
        
        //creating an array
        int [][]b=new int[row][column];
        
        System.out.println("Metrix at 0 degree : ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
        //rotate by 90 degree
		System.out.println("Rotate 90 degree right : ");
        for(int i=0; i<row; i++) {
        	for(int j=0; j<column; j++) {
        		for(int k=column-1; k>=0; k--) {
        			b[i][j]=arr[k][j];
        			System.out.print(b[i][j]+" ");
        		}
        	System.out.println();
        	}
        System.out.println();
        //break;
        }
        
     KB.close();
	 }
}