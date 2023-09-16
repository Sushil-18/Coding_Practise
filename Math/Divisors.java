public class Divisors {
    public static void main(String args[]) {
        int num = 36;
        for (int i = 1; i <= 36; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}