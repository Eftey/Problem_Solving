import java.io.*;
import java.util.*;

/*
    Problem: Bear and Candies 123
    1) Here we check if it's even then we feed bob else we feed Limak
    2) Then also we check whoever cannot eat anymore
    3) The one who cannot is the loser, so we print the other one as the winner
*/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int l = in.nextInt(), b = in.nextInt(), ll = 0, bb = 0;
            for (int i = 0; ; i++) {
                if (i % 2 == 0) {
                    bb += i;
                    if (bb > b) {
                        pw.println("Limak");
                        break;
                    }
                } else {
                    ll += i;
                    if (ll > l) {
                        pw.println("Bob");
                        break;
                    }
                }
            }
        }
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}