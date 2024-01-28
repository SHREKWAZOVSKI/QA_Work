package task7;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        //задание 1
        System.out.println("Введите количество строк массива");
        int a = scanner.nextInt();
        System.out.println("Введите количество столбцов массива");
        int b = scanner.nextInt();

        int maxVar;
        int[] maxArray = new int[a];
        int[][] randomArray = new int[a][b];
        for (int i = 0; i < a; i++) {
            maxVar = -1;
            for (int j = 0; j < b; j++) {
                randomArray[i][j] = random.nextInt(0, 1000);
                System.out.print(randomArray[i][j] + " ");

                if (randomArray[i][j] > maxVar) {
                    maxVar = randomArray[i][j];
                }
            }
            maxArray[i]=maxVar;
            System.out.println();
        }
        System.out.print("Ваши максимальные значения: ");
        for (int outMaxVar:maxArray){
            System.out.print(outMaxVar + " ");
        }

        // задание 2
        System.out.println("\n==================");
        System.out.println("All Set. Get ready to rumble!");
        char[][] arrayGame = new char[5][5];
        int y = random.nextInt(0, 4);
        int x = random.nextInt(0, 4);
        char fieldSymbol = '-';

        for (int i = 0; i < 5; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 5; j++) {
                arrayGame[i][j] = fieldSymbol;
                System.out.print(arrayGame[i][j] + " ");
            }
            System.out.println("]");
        }


        boolean game = false;
        int userLine, userColumn;
        String userString;
        while (!game) {
            System.out.println("Введите строку для удара (1-5): ");
            userString = scanner.nextLine();
            if (!userString.equals("1") && !userString.equals("2") && !userString.equals("3") && !userString.equals("4") && !userString.equals("5")) {
                System.out.println("Вы ввели неправильное значение");
                continue;
            }
            userLine = Integer.parseInt(userString);


            System.out.println("Введите столбец для удара (1-5): ");
            userString = scanner.nextLine();
            if (!userString.equals("1") && !userString.equals("2") && !userString.equals("3") && !userString.equals("4") && !userString.equals("5")) {
                System.out.println("Вы ввели неправильное значение");
                continue;
            }
            userColumn = Integer.parseInt(userString);


            if (userLine-1 == x && userColumn-1 == y) {
                System.out.println("You have won!");
                arrayGame[userLine-1][userColumn-1]='x';
                game=true;
            }
            else {
                arrayGame[userLine-1][userColumn-1]='*';
            }

            for (int i = 0; i < 5; i++) {
                System.out.print("[ ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(arrayGame[i][j] + " ");
                }
                System.out.println("]");
            }
        }
    }
}
