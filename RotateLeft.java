package Com.DeepanshuSir.Array;
 
import java.util.Scanner;

public class RotateLeft {
	
	public static void main(String[] args) {	
        Scanner KB=new Scanner(System.in);
        
        System.out.print("Enter number of row : ");  
        int row=KB.nextInt();
        System.out.print("Enter number of column : ");
        int column=KB.nextInt();
            
        //creating an array
        int[][] arr=new int[row][column];
        
        //initialization of array
        System.out.println("Enter array elements :");
        for(int i=0; i<row; i++) {
        	for(int j=0; j<column; j++) {
        		arr[i][j]=KB.nextInt();
            }
        } 
        
        //creating an array
        int[][] b=new int[row][column];
      
        System.out.println("Metrix at 0 degree : ");
		int k=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
			
		//rotate by 90 degree
		System.out.println("Rotate 90 degree left : ");
		for(int i=0; i<row; i++) {
			k=column-1-i;
			for(int j=0; j<column; j++) {
				b[i][j]=arr[j][k];
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
      
		//rotate by 180 degree
		System.out.println("Rotate 180 degree left : ");
		for(int i=0; i<row; i++) {
			k=column-1-i;
			for(int j=0; j<column; j++) {
				arr[i][j]=b[j][k];
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
      
		//rotate by 270 degree
		System.out.println("Rotate 270 degree left : ");
		for(int i=0; i<row; i++) {
			k=column-1-i;
			for(int j=0; j<column; j++) {
				b[i][j]=arr[j][k];
				System.out.print(b[i][j]+" ");
			}
		System.out.println();
		}
      
	KB.close();
	}
}
 