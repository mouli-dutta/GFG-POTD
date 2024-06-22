/*
Saturday, June 22, 2024
https://www.geeksforgeeks.org/problems/extract-the-number-from-the-string3428/1

Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. If no such number exists, return -1.

Examples :

Input: sentence="This is alpha 5057 and 97"
Output: 5057
Explanation: 5057 is the only number that does
not have a 9.
Input: sentence="Another input 9007"
Output: -1
Explanation: Since there is no number that
does not contain a 9,output is -1.

*/

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        long max = -1;
    
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!token.contains("9")) {
                try {
                    long num = Long.parseLong(token);
                    if (num > max) {
                        max = num;
                    }
                } catch (NumberFormatException ignored) {}
            }
        }
        return max;
    }
}


/*
Complexity Analysis
￣￣￣￣￣￣￣￣￣￣￣
The StringTokenizer class iterates through the words on the fly, which is more memory efficient and slightly faster.
While Loop runs through each token, checks if it contains '9', and tries to parse it if it doesn't. 

Final Time Complexity:
￣￣￣￣￣￣￣￣￣￣￣￣
The method has a linear time complexity O(n), 
where n is the length of the sentence, 
because it has to examine each character in the sentence. 

Final Space Complexity:
￣￣￣￣￣￣￣￣￣￣￣￣￣
The dominant term in the space complexity is the space used to store the input string, which is O(n).
The additional space used by StringTokenizer and the loop variables is O(1).

*/
