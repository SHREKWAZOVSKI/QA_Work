package task8;

import task6.Task6;

import java.util.Scanner;

public class Task8_methodClass {
    /*    1)Написать метод, который будет спрашивать у пользователя ввести с клавиатуры предложение
а после выводит в консоль из скольки слов состоит данное предложение.
А также этот метод должен возвращать количество этих слов.*/
    public int howManyWords(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше предложение: ");
        int countWords = scanner.nextLine().split(" ").length;
        System.out.println("Количество слов в вашей строке: " + countWords);
        return countWords;
    }

    public static void main(String[] args) {
        Task8_methodClass main = new Task8_methodClass();
        main.howManyWords();
    }
}
