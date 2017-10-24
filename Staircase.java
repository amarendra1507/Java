import java.io.*;
import java.util.*;
class Staircase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int k,l;
		for(int j=N-1;j>=0;j--){
			for(k=0;k<j;k++)
				System.out.print(" ");

			for(l=j;l<N;l++)
				System.out.print("#");

			System.out.println();	
		}	
	}
}