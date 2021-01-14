package Modele_1;
import java.io.*;
public class odd_number_matrix {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of rows and columns in the matrix: ");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int ar[][]=new int[m][n];
		int i,j;
		System.out.println("Enter the elements inside the matrix: ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				ar[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("The old elements in the matrix: ");
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				if(ar[i][j]%2!=0) {
					System.out.println(ar[i][j]);
				}
			}
		}
	}
}
