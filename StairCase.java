import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n-1;i>=0;i--) {
            int x=i, y=n-i;
            while(x-->0) {
                System.out.print(" ");
            }
            while(y-->0) {
                System.out.print("#");
            }
            System.out.println();
            
            
        }
    }
}
