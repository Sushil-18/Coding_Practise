import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 0;

        for (int i = 1; i < num; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                num2 = j;
            }
            for (int k = 0; k < (num - num2 - 1) * 2; k++) {
                System.out.print(" ");
            }
            num2 = 0;
        }
    }
}