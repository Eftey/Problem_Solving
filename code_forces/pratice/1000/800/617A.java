import java.io.*;
import java.util.*;

/*
    Problem: Elephant
    1) Bigger steps are better so always divide by 5
    2) But if any numbers that are not divisible by 5
    3) Then we have 4, 3, 2, 1 in total 4 steps
    4) So we add 4 steps to the input
    5) And even if sometimes the actual number is greater or smaller than 5
    6) It will not exceed out of 5
    7) Because we're dividing by 5
    8) Hence restraining the result within 5 and some fraction
    9) And to deal with the fraction we use Int division
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        pw.println((x + 4) / 5);
        pw.close();
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}