package Recursion;

class Calculate {
    public int calfact(int num) {
        if(num == 0)
            return 1;
        return num * calfact(--num);
    }
}

public class Factorial {
    public static void main(String args[]) {
        Calculate obj = new Calculate();
        int fact = obj.calfact(0);
        System.out.println("The factorial of given number is:" + fact);
    }
    
}
