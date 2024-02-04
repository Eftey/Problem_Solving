
/*
    Problem: Valid Parentheses
    1) The idea is to add to the stack only if the right brackets are there
    2) If there's left one then just check if the previous one was matching with the current one
    3) If not then return false else continue
    4) If there's matched then the stack won't be empty
    5) So return that result since every right got their co-responding left brackets
 */


public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char i : s.toCharArray()) {
        if (i == '(' || i == '{' || i == '[') stack.push(i);
        else {
            if (stack.isEmpty()) return false;
            char x = stack.peek();
            stack.pop();
            if (x == '(' && i != ')' || x == '{' && i != '}' || x == '[' && i != ']') return false;
        }
    }
    return stack.isEmpty();
}