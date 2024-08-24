import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int day;
        double y, x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сколько километров пробежал спортсмен в первый день");
        x = scan.nextDouble();
        System.out.println("Введите сколько километров необходимо пробежать спортсмену");
        y = scan.nextDouble();
        for (day = 0; x <= y; day++) {
            x = x * 1.1;
        }
        System.out.println(day);
    }
}
