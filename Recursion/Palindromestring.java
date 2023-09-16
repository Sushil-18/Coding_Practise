package Recursion;

import java.util.Scanner;

class Check {
    public boolean palindrome(String string, int start, int end) {
        if (start < end) {
            if (string.charAt(start) != string.charAt(end))
                return false;
            return palindrome(string, start + 1, end - 1);
        }
        return true;
    }
}
public class Palindromestring {
    public static void main(String args[]) {
        Check obj = new Check();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int length = str.length();
        boolean cnfm = obj.palindrome(str.toLowerCase(), 0, length-1);
        if (cnfm == true) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
