import java.io.*;
import java.util.*;

/*
    Problem: Length of Last Word
    1) Split the String by " " space it'll return the string into an array
    2) Then return the last string of the array
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        //String s = in.next();
        String s = "luffy is still joyboy";
        String[] arr = s.split(" ", 0);
        pw.println(arr[arr.length - 1].length());
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}