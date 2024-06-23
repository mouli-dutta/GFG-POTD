/*
https://www.geeksforgeeks.org/problems/print-bracket-number4058/1
Given a string str, the task is to find the bracket numbers, i.e., for each bracket in str, return i if the bracket is the ith opening or closing bracket to appear in the string. 

 Examples:

Input:  str = "(aa(bdc))p(dee)"
Output: 1 2 2 1 3 3
Explanation: The highlighted brackets in
the given string (aa(bdc))p(dee) are
assigned the numbers as: 1 2 2 1 3 3.
Input:  str = "(((()("
Output: 1 2 3 4 4 5
Explanation: The highlighted brackets in
the given string (((()( are assigned
the numbers as: 1 2 3 4 4 5
*/

class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        // code here
        Stack<Integer> bracket = new Stack<>();
        int count = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
        for(char c : str.toCharArray()) {
            if(c == '(') {
                ++count;
                bracket.push(count);
                res.add(count);
                
            } else if(c == ')') {
                res.add(bracket.pop());
            }
        }
        return res;
    }
}
