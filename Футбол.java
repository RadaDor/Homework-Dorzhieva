import java.util.Scanner;

//выигрыш 3 очка, проигрыш 0 очков, ничья - 1 очко
public class Футбол {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте! Введите количество очков, полученных командой: ");
        int number = sc.nextInt();
        sc.close();


        if (number == 3) {
            System.out.println("Выигрыш");
        } else if (number == 0) {
            System.out.println("Проигрыш");
        } else if (number == 1) {
            System.out.println("Ничья");
        } else {
            System.out.println("Некорректные данные, введите 3,0 или 1");
        }
    }
}
