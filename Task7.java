public class Task7 {
    public static void main(String[] args) {
        int j, i;
        i = 5;
        j = (int) Math.pow(2, 30);
        while (j > i) {
            j >>= 1;
        }
        while (j > 0) {
            System.out.print(i / j > 0 ? 1 : 0);
            i %= j;
            j >>= 1;
        }
    }
}

