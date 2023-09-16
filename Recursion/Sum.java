package Recursion;

class Addition {
    public int Add(int num) {

        if (num == 0) {
            return 0;
        }
        return num + Add(--num);
    }
}
public class Sum {
    public static void main(String args[]) {
        Addition obj = new Addition();
        int sum = obj.Add(10);
        System.out.println("The addition is " + sum);
    }
}