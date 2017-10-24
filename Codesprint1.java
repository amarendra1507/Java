import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Codesprint1 {

    static int solve(String opr) {
        int num1=Character.getNumericValue(opr.charAt(0));
        int num2=Character.getNumericValue(opr.charAt(2));
        char operator=opr.charAt(1);
        // int num2=Integer.parseInt(opr.substring(1,1));
        if(operator=='+'){
            return (num1+num2);
        }
            
        else{
            
            return (num1-num2);
            
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
