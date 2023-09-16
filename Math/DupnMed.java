public class DupnMed {
     public static int PeasuntMultiply(int x, int y) {
        int prod = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                prod += y;
            }
            x = x/2;
            y += y;

        }
        return prod;
    }

    public static void main(String args[]) {
        int prod = PeasuntMultiply(10, 20);
        System.out.println(prod);
    }

}