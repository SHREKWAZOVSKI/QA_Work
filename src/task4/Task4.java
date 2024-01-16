package task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //задание 1
        String string1, string2, string3, string4;
        System.out.println("Введите текст: Я тестирую замечательно. Что еще нужно?");
        string1 = scanner.next();
        string2 = scanner.next();
        string3 = scanner.next();
        string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println("string1 = " + string1 + "\nstring2 = " + string2 + "\nstring3 = " + string3 + "\nstring4 = " + string4);
        System.out.println("================");



        //задание 2
        int a, b, c;
        System.out.println("Введите три значения стороны треугольника");
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());
        c = Integer.parseInt(scanner.next());
        if (a>0 && b>0 && c>0 && (a+b)>c && (a+c)>b && (b+c)>a) {
            System.out.println("Треугольник можно построить");
        } else {
            System.out.println("Треугольник нельзя построить");
        }
        System.out.println("================");



        //задание 3
        System.out.println("Введите два числа");
        int firstNum = Integer.parseInt(scanner.next()), secondNum = Integer.parseInt(scanner.next());
        int sum = firstNum > secondNum ? firstNum - secondNum : secondNum - firstNum;
        System.out.println("Разница чисел равняется " + sum);
        System.out.println("================");


        //задание 4
        System.out.println("Введите день недели");
        int weekNumber=Integer.parseInt(scanner.next());
        if (weekNumber==1) {
            System.out.println("Понедельник");
        } else if (weekNumber==2) {
            System.out.println("Вторник");
        } else if (weekNumber==3) {
            System.out.println("Среда");
        } else if (weekNumber==4) {
            System.out.println("Четверг");
        } else if (weekNumber==5) {
            System.out.println("Пятница");
        } else if (weekNumber==6) {
            System.out.println("Суббота");
        } else if (weekNumber==7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }
        System.out.println("================");



        //задание 5
        System.out.println("Введите два числа");
        int firstNumber = Integer.parseInt(scanner.next()), secondNumber = Integer.parseInt(scanner.next());
        System.out.println("Введите одно из доступных действий: - + % * /");
        String symbol = scanner.next();

        int result = symbol.equals("-") ? firstNumber-secondNumber : symbol.equals("+") ? firstNumber+secondNumber :
                symbol.equals("%") ? firstNumber%secondNumber : symbol.equals("*") ? firstNumber*secondNumber : symbol.equals("/") ? firstNumber/secondNumber : 0;
        System.out.println("Ваш результат : " + result);
        System.out.println("================");



        //задание 6
        System.out.println("Введите программу, которую хотите скачать\nIntelliJ IDEA\nGit\nJava");
        String program = scanner.nextLine().toLowerCase();
        System.out.println("Введите необходимую ОС\nWindows\nLinux\nmacOS");
        String os = scanner.nextLine().toLowerCase();
        switch (program + os) {
            case ("intellij ideawinows"):
                System.out.println("Ссылка на скачивание IntelliJ IDEA для Windows: " +
                        "https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC"); break;
            case ("intellij idealinux"):
                System.out.println("Ссылка на скачивание IntelliJ IDEA для Linux: " +
                        "https://www.jetbrains.com/idea/download/download-thanks.html?platform=linux&code=IIC"); break;
            case ("intellij ideamacos"):
                System.out.println("Ссылка на скачивание IntelliJ IDEA для macOS: " +
                        "https://www.jetbrains.com/idea/download/download-thanks.html?platform=mac&code=IIC"); break;
            case ("gitwindows"):
                System.out.println("Ссылка на скачивание Git для Windows: " +
                        "https://git-scm.com/download/win"); break;
            case ("gitlinux"):
                System.out.println("Ссылка на скачивание Git для Linux: " +
                        "https://git-scm.com/download/linux"); break;
            case ("gitmacos"):
                System.out.println("Ссылка на скачивание GIt для macOS: " +
                        "https://git-scm.com/download/mac"); break;
            case ("javawindows"):
                System.out.println("Ссылка на скачивание Java для Windows: " +
                        "https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe"); break;
            case ("javalinux"):
                System.out.println("Ссылка на скачивание Java для Linux: " +
                        "https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.rpm"); break;
            case ("javamacos"):
                System.out.println("Ссылка на скачивание Java для macOS: " +
                        "https://download.oracle.com/java/21/latest/jdk-21_macos-aarch64_bin.dmg"); break;
            default:
                System.out.println("Такой системы не существует");
        }
    }
}