/*
    Problem: Pascal's Triangle
    1) Add the first row first
    2) Then move up using prev * (i-j) and down using (j+1)
    3) Then take the sum and add the list into the final list
*/


public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> arr = new ArrayList<>();
    arr.add(List.of(1));
    for (int i = 1; i < numRows; i++) {
        List<Integer> li = new ArrayList<>();
        int prev = 1;
        for (int j = 0; j <= i; j++) {
            li.add(prev);
            prev = prev * (i - j) / (j + 1);
        }
        arr.add(li);
    }
    return arr;
}