import java.io.*;
import java.util.*;
class Candle{
	 static int birthdayCakeCandles(int n, int[] ar) {
	 	int max=0,count=0;


	 	for(int i=0;i<n;i++){
	 		if(max<ar[i])
	 			max=ar[i];

	 		if(ar[i]==max)
	 			count+=1;

	 	}
	 	// for(int j=0;j<n;j++){
	 	// 	if(ar[j]==max)
	 	// 		count+=1;
	 	// }

	 	return count;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}