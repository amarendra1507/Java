import java.io.*;

import java.util.*;

class Test{
	public static void main(String args[]){

		int x=2,y=2,w=3;

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();




		int mat[][]=new int[n][n];
		


		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				
					mat[i][j]=0;
					
				}


			}
		}

		mat[x][y]=w;


		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print("  "+mat[i][j]);
			}
			System.out.println();
		}
	}

}