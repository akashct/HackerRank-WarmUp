import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int pos=0, neg=0, zer=0;
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            if(a[i]>0){
                pos++;
            } else if(a[i]<0){
                neg++;
            } else
                zer++;
        }
        System.out.printf("%.6f",(float)pos/n);
        System.out.println();
        System.out.printf("%.6f",(float)neg/n);
        System.out.println();
        System.out.printf("%.6f",(float)zer/n);
    }
}
