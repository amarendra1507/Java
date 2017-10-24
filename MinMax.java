import java.io.*;
import java.util.*;
class MinMax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5],j,k,temp;
		int arrcpy[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();

		for( j=0;j<5;j++){
			sum=0;
			for(k=0;k<5;k++){
				if(j==k)
					continue;
				sum+=arr[k];	
			}
			arrcpy[j]=sum;
		}

		for (int p = 0; p < 5; p++) 
        {
            for (int q = p + 1; q < 5; q++) 
            {
                if (arrcpy[p] > arrcpy[q]) 
                {
                    temp = arrcpy[p];
                    arrcpy[p] = arrcpy[q];
                    arrcpy[q] = temp;
                }
            }
        }

        System.out.println(arrcpy[0]+","+arrcpy[4]);
	}
}