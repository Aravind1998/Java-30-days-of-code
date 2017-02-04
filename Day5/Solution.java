import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<10;i++)
            {
            System.out.println(n + " x " + (i+1) + " = " + (n*(i+1)));
        }
    }
}
