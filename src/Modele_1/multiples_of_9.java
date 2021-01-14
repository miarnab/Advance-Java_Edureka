package Modele_1;
import java.io.*;
public class multiples_of_9 {
	public static void main(String args[])throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the number: ");
		int n=Integer.parseInt(br.readLine());
		int i,p=1;
		for(i=1;i<=n;i++) {
			p=9*i;
			System.out.println(9+"x"+i+"="+p);
		}
	}
}
