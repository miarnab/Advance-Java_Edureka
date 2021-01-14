package Modele_1;
import java.io.*;
public class matrix_addition {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of rows and columns of first matrix: ");
		int m=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of rows and columns of second matrix: ");
		int p=Integer.parseInt(br.readLine());
		int q=Integer.parseInt(br.readLine());
		if(m!=p||n!=q) {
			System.out.println("Addition of matrices not possible");
		}
		else {
			int a[][]=new int[m][n];
			int b[][]=new int[p][q];
			int c[][]=new int[m][n];
			int i=0,j=0;
			System.out.println("Enter the elements of the first matrix: ");
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					a[i][j]=Integer.parseInt(br.readLine());
				}
			}
			System.out.println("Enter the elements of the second matrix: ");
			for(i=0;i<p;i++) {
				for(j=0;j<q;j++) {
					b[i][j]=Integer.parseInt(br.readLine());
				}
			}
			System.out.println("The resultant matrix is: ");
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			for(i=0;i<m;i++) {
				for(j=0;j<n;j++) {
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
	}
}
