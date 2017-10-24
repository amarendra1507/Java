import java.io.*;
import java.util.*;
class fib{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long t1=1,t2=2,next_element=0;
            long even_sum=t2;
            int i=0; 
            while(i<n){
            	next_element=t1+t2;
            	if(next_element>n)
            		break;
            	if(next_element%2==0){
            			even_sum=even_sum+next_element;	
            	}
            	t1=t2;
            	t2=next_element;
            	i++;
            }
            System.out.println(even_sum);
        }
	}	
}