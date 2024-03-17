import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить второе число
        // в 5 раз
        System.out.println ("Введите два двузначных числа");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (Math.sqrt(b) < Math.sqrt(a)) {
            System.out.println("число b требует увеличения и будет равно = " + (b = b * 5));
        } else {
            System.out.println ("Увеличение второго числа не требуется");
        }
    }
}
