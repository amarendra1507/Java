import java.io.*;
import java.util.*;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String A=sc.next();
		String temp="";
		int j;
		int lengthA=A.length();
		for(j=lengthA-1;j>=0;j--){
			temp=temp+A.substring(j,j+1);
		}
		System.out.println(temp);
		if(temp.equals(A))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}