public class Task10 {
    public static void main(String[] args) {
        int a, b, k, c;
        c = 0;
        a = 1;
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                a *= i;
            }
        }
        b = a;
        for (int j = 1; j <= 20; j++) {
            if (b % j != 0) {
                for (k = 2; k * k <= j; k++) {
                    if (j % k == 0) {
                        c = k;
                        break;
                    }
                }
                b = b * c;
                j--;
            }
        }
        System.out.println(b);
    }
}
