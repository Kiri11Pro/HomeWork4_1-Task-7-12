public class Task8 {
    public static void main(String[] args) {
        int a, b, c, d, j;
        j = 0;
        for (int time = 0; time < 2400; time++) {
            a = time / 1000;
            b = time % 1000 / 100;
            c = time % 100 / 10;
            d = time % 10;
            if (a > 2 || b > 5 || c > 5 || d > 2) {
                continue;
            }
            if (a == d && c == b) {
                System.out.println(a + "" + b + ":" + c + "" + d);
                j++;
            }
        }
        System.out.println("Общее число комбинаций - " + j);
    }
}
