import java.util.Scanner;

public class Площадь {
    //даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите данные радиуса круга r и стороны квадрата a");
        int r = sc.nextInt();
        int a = sc.nextInt();
        double S1 = Math.PI * r * r;
        double S2 = Math.sqrt(a);

        if (S1 > S2) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if (S1 < S2) {
            System.out.println("Площадь круга меньше площади квадрата");
        } else {
            System.out.println("Площадь круга равна площади квадрата");
        }

    }
}
