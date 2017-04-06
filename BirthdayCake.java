import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        height[0]=in.nextInt();
        int big=height[0], count=0;
        for(int height_i=1; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i]>big){
                big=height[height_i];
            }
        }
        for(int i=0;i<n;i++){
            if(height[i]==big){
                count++;
            }
        }
        System.out.print(count);
    }
}
