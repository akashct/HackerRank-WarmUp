import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int r1=0, r2=0;
        for(int i=0;i<3;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i] = in.nextInt();
        }
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                r1++;
            } else if(a[i]<b[i]){
                r2++;
            }
        }
        System.out.print(r1+" "+r2);
        
    }
}
