import java.util.Scanner;

public class Task3 {
    //Дано двузначное число.
    // 1.Определить остаток от деления десятков на единицы
    // 2. Результат деления единиц на десятки
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        int number = sc.nextInt();

        double units = number % 10;
        double decimals = number / 10;

        System.out.println("Остаток равен = " + (decimals % units));
        System.out.println("Результат деления = " + (units / decimals));

    }
}