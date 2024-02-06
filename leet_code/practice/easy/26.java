import java.beans.PropertyEditorManager;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


/*
    Problem: Remove Duplicates from Sorted Array
    1) There are two methods
    2) One is using the set which automatically removes all the duplicates
    3) Two removing the duplicates by finding the max of the current value
    4) Meaning: When 1, 1, 2 if you select 1 as max then 1 == 1 not greater so it will skip another 1
    5) Since the array is sorted so it works easily
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] n = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        pw.println(removeDuplicates(n));
        pw.close();
    }

    public static int removeDuplicate(int[] nums) {
        Set<Integer> sets = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.printf(sets.toString());
        return sets.size();
    }

    public static int removeDuplicates(int[] nums) {
        int max = Integer.MAX_VALUE, c = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != max) {
                max = nums[i];
                nums[c] = nums[i];
                c++;
            }
        return c;
    }


    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}