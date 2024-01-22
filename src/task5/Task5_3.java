package task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //задание 1
        System.out.println("Введите слова для предложениия");
        String userWord = scanner.nextLine();
        String userResult = "";
        while (!userWord.equals("STOP")) {
            userResult = userResult + userWord;
            userWord = scanner.nextLine();
        }
        System.out.println("Ваш результат: " + userResult);
        System.out.println("=================");


        //задание 2
        System.out.println("Введите число для проверки на палиндром");
        String palindrom = scanner.nextLine();
        boolean ifPalindrom = true;
        for (int i = 0; i < palindrom.length() / 2; i++) {
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i - 1)) {
                ifPalindrom = false;
                break;
            }
        }
        if (ifPalindrom) {
            System.out.println("Ваше число является палиндромом");
        } else {
            System.out.println("Ваше число не является палиндромом");
        }
        System.out.println("=================");


        //задание 3
        System.out.println("Введите максимальную вместимость склада");
        int maxStorage = scanner.nextInt(), currentStorage = 0, metal;
        while (currentStorage < maxStorage) {
            System.out.println("Вы можете оставить на складе ещё " + (maxStorage - currentStorage));
            System.out.println("Введите вес, который хотите сдать на склад");
            metal = scanner.nextInt();
            if (metal + currentStorage > maxStorage || metal < 5) {
                System.out.println("Вы не можете сдать столько материала");
                continue;
            }
            currentStorage += metal;
        }


        //задание 4
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] time = {10, 12, 14, 16, 18, 20};
        String[] place = {"школу", "магазин", "церковь", "тренажёрный зал", "кино", "поликлинику"};
        System.out.println("Введите 3 цифры с клавиатуры: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(names[a] + " будет идти в " + place[b]+ " в " + time[c] + ":00");
        System.out.println("=================");


        //задание 5
        Random random = new Random();
        int[] numbersArray = new int[10];

        System.out.println("Введите число которое нужно найти: ");
        int findMyNumber = scanner.nextInt();
        boolean isFindNumber = false;

        for (int i = 0; i < 10; i++){
            numbersArray[i]=random.nextInt(-20,20);
            System.out.print(numbersArray[i] + " ");
            if (numbersArray[i]==findMyNumber) {
                isFindNumber = true;
            }
        }
        if (!isFindNumber){
            System.out.println("\nВашего значения нет в массиве");
        }
        else {
            System.out.println("\nВаше значение есть в массиве");
        }
        System.out.println("=================");


        //задание 6
        int[] numbersArrayTask6 = new int[50];
        int minimum = 51;
        int maximum = -51;

        for (int i = 0; i < 50; i++) {
            numbersArrayTask6[i] = random.nextInt(-50, 50);
            System.out.print(numbersArrayTask6[i] + " ");
            if (numbersArrayTask6[i] < minimum) {
                minimum = numbersArrayTask6[i];
            }
            if (numbersArrayTask6[i]>maximum){
                maximum=numbersArrayTask6[i];
            }
        }
        System.out.println("\nВаш минимальный элемент: " + minimum);
        System.out.println("Ваш максимальный элемент: " + maximum);
    }
}