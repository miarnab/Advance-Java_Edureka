package Modele_1;
import java.io.*;
public class array_of_even_numbers {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number of elements in the array: ");
		int n=Integer.parseInt(br.readLine());
		int ar[]=new int[n];
		int i;
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<n;i++) {
			ar[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("The even elements in the array: ");
		for(i=0;i<n;i++) {
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
		}
	}
}
