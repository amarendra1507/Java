import java.util.*;

class Pangram{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		boolean  flag=true;
		for(char i='a';i<='z';i++){
			if(str.indexOf(i)==-1)
				flag=false;
			
				
			
		}
		if(flag)
			System.out.println("pangram");
		else
			System.out.println("not pangram");



		//System.out.println(flag);

	}
}