import java.io.*;
import java.util.*;

public class Solution {
         static int Factorial(int n)
            {
            if(n==0)
                 return 1;
            else
                 return (n*Factorial(n-1));
        }
    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fact = Factorial(number);
       System.out.println(fact);
    }
    
}
