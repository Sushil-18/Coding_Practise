public class Prime {
    public static void main(String args[]) {
        int num = 17;
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(num + " is prime number!!");
        }
        else {
            System.out.println(num + " is not prime number!!");
        }
    }
}
