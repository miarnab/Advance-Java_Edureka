package Modele_1;
import java.io.*;
public class printing_integers {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number: ");
		int n=Integer.parseInt(br.readLine());
		int i;
		System.out.printf("The numbers upto %d: ",n);
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
}
