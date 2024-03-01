/*
    Problem: Pascal's Triangle II
    1) Add the first row first
    2) Then move up using prev * (i-j) and down using (j+1)
    3) Then take the sum inside prev
    4) And finally add it to the list and return it
*/

public static List<Integer> getRow(int x) {
    List<Integer> arr = new ArrayList<>();
    arr.add(1);
    long prev = 1;
    for (int k = 1; k <= x; k++) {
        prev = prev * (x - k + 1) / k;
        arr.add((int) prev);
    }
    return arr;
}