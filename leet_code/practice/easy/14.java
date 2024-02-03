/*
    Problem: Longest Common Prefix
    1) Since common then we can sort it to bring out in the same order
    2) Then find at least 2 Strings to compare and find which one is the shortest
    3) Since all could have the same characters then we just have to compare with the smallest to save time
    4) Then compare and see if there's a match or not
    5) If so then add that particular character into a new String
    6) Return the new String
 */


class Solution {
    public String longestCommonPrefix(String[] x) {
        StringBuilder s = new StringBuilder();
        Arrays.sort(x);
        int min = Math.min(x[0].length(), x[x.length - 1].length());
        for (int i = 0; i < min; i++)
            if (x[0].charAt(i) == x[x.length - 1].charAt(i)) {
                s.append(x[0].charAt(i));
            } else return s.toString();
        return s.toString();
    }
}