import java.io.*;
import java.util.*;

class Time{
	static void timeConversion(String s) {
        
        String time[]=s.split(":");

        int hours=Integer.parseInt(time[0]);
        String minutes=time[1];
        String seconds=time[2].substring(0,2);
        String AmPm=time[2].substring(2,4);
        

        String am="AM",pm="PM";
        //int h=hours;
        String hh=null;
     
        if(AmPm.equals(am) && hours<12){
        	if(hours==11 || hours == 10){
        		hh=Integer.toString(hours);
        	}
        	else
        		hh="0"+Integer.toString(hours);

        }

        if(AmPm.equals(am) && hours==12){

        	// h=00;
        	// hh=Integer.toString(h);
        	// hh="0"+hh;
        	hh="00";
        }
        if(AmPm.equals(pm) && hours==12){
        	hh=Integer.toString(hours);
        }

        if(AmPm.equals(pm) && hours<12){
        	hours=hours+12;
        	hh=Integer.toString(hours);
        }

        String miltime=hh+":"+minutes+":"+seconds;

       System.out.println(miltime);



        
        	// System.out.println(time[0]);
        	// System.out.println(time[1]);
        	// System.out.println(time[2]);
        	// System.out.println(AmPm);
        	// System.out.println(ss);
        

        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Time t=new Time();
        
        t.timeConversion(s);
        //System.out.println(result);
    }
}
