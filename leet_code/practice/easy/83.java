import java.io.*;
import java.util.*;

/*
    Problem: Remove Duplicates from Sorted List
    1) Here we just look for the duplicate from the current value with the next value
    2) If it detect the duplicate then skip the value by storing the next.next value into the current
    3) And since we're using next.next that's why we had to check for it in the while loop as well
    4) To avoid index out of bound error
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {

        }
        pw.close();
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode x = head;
        while (x != null && x.next != null) {
            if (x.val == x.next.val) x.next = x.next.next;
            else x = x.next;
        }
        return head;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}