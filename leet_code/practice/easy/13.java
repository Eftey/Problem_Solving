
/*
    13. Roman to Integer
    1) Replace all pair values and recreate the string
        1.1) While doing so store the sum in a variable
    2) Iterate through the remaining values and add them to the sum
    3) Print the sum
 */

class Solution {

    int x = 0;
    public int romanToInt(String s) {
        String ss = findDouble(s);
        for (char i : ss.toCharArray()) {
            if (i == 'I') x += 1;
            else if (i == 'V') x += 5;
            else if (i == 'X') x += 10;
            else if (i == 'L') x += 50;
            else if (i == 'C') x += 100;
            else if (i == 'D') x += 500;
            else if (i == 'M') x += 1000;
        }
        return x;
    }

    public String findDouble(String s) {
        if (s.contains("IV")) {
            x += 4;
            s = s.replace("IV", ".");
        }
        if (s.contains("IX")) {
            x += 9;
            s = s.replace("IX", ".");
        }
        if (s.contains("XL")) {
            x += 40;
            s = s.replace("XL", ".");
        }
        if (s.contains("XC")) {
            x += 90;
            s = s.replace("XC", ".");
        }
        if (s.contains("CD")) {
            x += 400;
            s = s.replace("CD", ".");
        }
        if (s.contains("CM")) {
            x += 900;
            s = s.replace("CM", ".");
        }
        return s;
    }
}