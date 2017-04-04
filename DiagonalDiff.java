import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int dig1=0, dig2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
                if(i==j){
                   dig1 = dig1+a[i][i]; 
                }
            }
        }
        for(int i=0,j=n-1;i<n;i++,j--){
                dig2 = dig2 + a[i][j];
        }
        if((dig1-dig2)<0){
            System.out.print((-1)*(dig1-dig2));
        }
        else
        System.out.print(dig1-dig2);
        
    }
}
