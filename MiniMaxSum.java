import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a[] = new long[5];
        a[0] = in.nextLong();
        long small=a[0], big=a[0], bigsum=0, smallsum=0;
        for(int i=1;i<5;i++){
            a[i] = in.nextLong();
            if(a[i]<=small) {
                small=a[i];
            }
            if(a[i]>=big){
                big = a[i];
            }
        }
        
        if(small==big){
            smallsum=4*a[0];
            System.out.print(smallsum+" "+smallsum);
        }
        else{
        
        for(int j=0;j<5;j++){
            if(a[j]!=small){
                bigsum = bigsum+a[j];
            }
            if(a[j]!=big){
                smallsum = smallsum+a[j];
            }
        }
        
        System.out.print(smallsum+" "+bigsum);
        }
    }
}
