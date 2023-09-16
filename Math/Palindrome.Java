import java.util.*;
class CheckPalindroem{
    public int check(int n){
        int num = n;
        int revNum = 0;
        int mod = 0;
        while(num !=0){
            mod = num % 10;
            revNum = revNum * 10 + mod;
            num = num / 10;
        }
        return revNum;
    }
}
public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        CheckPalindroem obj = new CheckPalindroem();
        int number = sc.nextInt();
        sc.close();
        int revNum = obj.check(number);
        if(number == revNum){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }

    }
}