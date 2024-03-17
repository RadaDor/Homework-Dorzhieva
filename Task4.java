import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Даны три вещественных числа a, b, c. Проверить:
        // 1. выполняется ли неравенство a<b<c;
        // 2. выполняется ли неравенство a>b>c;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите числа a, b, c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("Выполняется неравенство a<b<c");
        } else if (a > b && b > c) {
            System.out.println("Выполняется неравенство a>b>c");
        } else {
            System.out.println("Неравенство не выполнено");
        }

    }
}
