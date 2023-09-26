package String;

class Solution {
    public char findTheDifference(String s, String t) {
        int num1= 0;
        int num2 = 0;

        for(int i = 0; i < s.length(); i++){
            num1 += (int)s.charAt(i);
        }       
        for(int j = 0; j < t.length(); j++){
            num2 += (int)t.charAt(j);
        }

        return (char)(num2 - num1);
    }
}

public class Compare {
    public static void main(String args[]) {
    Solution obj = new Solution();
    char str = obj.findTheDifference("abcd", "bcade");
    System.out.println(str);
    } 
}
