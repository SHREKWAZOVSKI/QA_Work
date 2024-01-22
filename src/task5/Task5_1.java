package task5;

import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        /*1) Написать программу, которая будет просить ввести пользователя с клавиатуры число до тех пор
пока он не введет число 13. Также программа будет выводить в консоль число, введеное пользователем,
если оно четное.*/
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        System.out.println("Введите ваше число");
        userNumber = scanner.nextInt();
        while (userNumber!=13){
            if (userNumber%2==0){
                System.out.println("Ваше число чётное:" + userNumber);
            }
            System.out.println("Введите ваше число");
            userNumber = scanner.nextInt();
        }
    }
}
