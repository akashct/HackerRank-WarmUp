import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String time = new String();
        Scanner in = new Scanner(System.in);
        time = in.next();
        int hr, min, sec;
        
        if(time.substring(8,10).equals("AM") && (time.substring(0,2)).equals("12")){
            System.out.print("00");
            System.out.print(time.substring(2,8));
        }
        
        else if(time.substring(8,10).equals("PM") && (time.substring(0,2)).equals("12")){
            System.out.print(time.substring(0,8));
        }
        
        else if(time.substring(8,10).equals("PM")){
            System.out.print(Integer.parseInt(time.substring(0,2))+12);
            System.out.print(time.substring(2,8));
        }
       
         else {
            System.out.print(time.substring(0,8));
        }
        
    }
}
