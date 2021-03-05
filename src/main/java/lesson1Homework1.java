import java.util.Scanner;

public class lesson1Homework1 {
    public static Scanner sc = new Scanner(System.in);

    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static void tryNumber(int maxTryCount) {
        int i;
        int number = (int) (Math.random() * 10);
        for (i = 1; i <= maxTryCount; i++) {
            System.out.println("Ваша попытка № " + i);
            int d = getNumberFromScanner("Введите число в пределах от 0 до 9", 0, 9);
            if ( d < number ) {
                System.out.println("Вы ввели слишком маленькое число");
            } else if ( d > number ) {
                System.out.println("Вы ввели слишком большое число");
            } else {
                System.out.println("Поздравляю, вы угадали!");
                return;
            }
        }
        System.out.println("Игра окончена. Вы не смогли отгадать число " + number);
    }

    public static void main(String[] args) {
        int gameReplay = 1;
        do {
            int maxTryCount = 3;
            tryNumber(maxTryCount);
            gameReplay = getNumberFromScanner("Повторить игру ещё раз? 1 - да / 0 - нет", 0, 1);
        } while (gameReplay == 1);

        sc.close();
    }
}
