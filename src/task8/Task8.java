package task8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        //задание 1
        int[] mainArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printNumbers(mainArray);
        System.out.println("=============================");

        //задание 2
        String message = "Я - строка с сообщением";
        String[] stringMessages = {"Я -", "массив строк", "с", "сообщением"};
        int[] arrayNumbers = {1, 6, 7, 2, 3, 5};
        int numberForMessage = 50;
        String stringForMessage = "Я - вторая строка для второго сообщения";

        typeMessage();
        typeMessage(message);
        typeMessage(stringMessages);
        typeMessage(arrayNumbers);
        typeMessage(numberForMessage, stringForMessage);
        System.out.println("=============================");

        //задание 3
    }

    public static void typeMessage() {
        System.out.println("Я пустой");
    }

    public static void typeMessage(String voidString) {
        System.out.println(voidString);
    }

    public static void typeMessage(String[] voidArray) {
        for (String value : voidArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void typeMessage(int[] voidArray) {
        int sum = 0;
        for (int value : voidArray) {
            sum += value;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void typeMessage(int voidNumber, String voidString) {
        System.out.println("Ваше сообщение : " + voidString + ". Ваше число : " + voidNumber);
    }

    public static void printNumbers(int[] someArray) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int value : someArray) {
            if (value % 2 == 0) {
                evenNumbers.add(value);
            } else {
                oddNumbers.add(value);
            }
        }
        System.out.println("Парные числа: " + evenNumbers);
        System.out.println("Непарные числа: " + oddNumbers);
    }
}
