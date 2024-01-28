package task6;

import java.util.Random;
import java.util.Scanner;

public class Task6_Oleg {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(0, 100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра начинается)");
        System.out.println("Давайте познакомимся. Как вас зовут??");
        String theName = scan.nextLine().toUpperCase();
        System.out.println("Приятно познакомится " + theName + "!");
        System.out.println("И так " + theName + ", правила игры простые. Я загадал число от 0 до 100. Попробуйте его отгадать.");
        int number = 0;
        while (number != x) {
            System.out.println("Введите ваше число:");
            number = scan.nextInt();
            if (number < x) {
                System.out.println("Ваше число слишком маленькое. Пожалуйста, попробуйте снова...");
                continue;
            }
            if (number > x) {
                System.out.println("Ваше число слишком большое. Пожалуйста, поробуйте еще раз...");
                continue;
            }
            System.out.println("Мои поздравления " + theName + ". Вы угадали, это действительно число: " + x);
            System.out.println("...[GAME OVER]...");
            System.out.println("================================================================");
        }
    }
}
