import java.io.*;
import java.util.*;
class multiple{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum=0;
            if(n>=1){
            	for(int i=1;i<n;i++){
            		if(i%3==0 || i%5==0){
            			sum+=i;   			
            		}
            	}
            }
            System.out.println(sum);
        }
	}
}