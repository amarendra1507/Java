import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int N;
        float negative=0,positive=0,zero=0;
        float n,p,z;

        
        int arr[]=new int[10000];
        
        Scanner sc=new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if(arr[i]<0){
                negative+=1;
            }
            else if(arr[i]>0){
                positive+=1;
            }
            else if(arr[i]==0){
                zero+=1;
            }

            

        }
        
       
        n=negative/N;
        p=positive/N;
        z=zero/N;
       
        System.out.println(n+" "+p+" "+z);
        
            
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}