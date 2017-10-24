import java.io.*;
import java.util.*;
class Anargam{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		String lowercasevalue=input.toLowerCase();

		char chars[]=lowercasevalue.toCharArray();

		Arrays.sort(chars);

		

		// for(int i=0;i<lowercasevalue.length()-1;i++){
		// 	chars[i]=lowercasevalue.charAt(i);
		// }
		//Arrays.sort(chars);
		
		// SortedSet<String> sets=new SortedSet<String>();
		// for(int i=0;i<lowercasevalue.length()-1;i++){
		// 	sets.add(lowercasevalue.substring(i.i+1));
		// }

		//System.out.print(sets);
	}
}
	