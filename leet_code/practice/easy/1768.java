/*
    Problem: Merge Strings Alternately
    1) First we iterate through the short string one after the other
    2) THen we append whoever is the longest one into the final answer and print it
 */

public static String mergeAlternately(String s1, String s2) {
    int n = Math.min(s1.length(), s2.length()), i = 0;
    StringBuilder sb = new StringBuilder();
    for (; i < n; i++) {
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
    }
    if (s1.length() > s2.length()) for (int j = 0; j < s1.length() - n; j++, i++) sb.append(s1.charAt(i));
    else for (int j = 0; j < s2.length() - n; j++, i++) sb.append(s2.charAt(i));
    return sb.toString();
}