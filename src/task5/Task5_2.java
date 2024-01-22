package task5;

public class Task5_2 {
    public static void main(String[] args) {
         /*    5)Пользователь вводит с клавиатуры число, а на консоль выводится квадрат из звездочек
    со стороной равной этому числу.
    Пример: Пользователь ввел 5, вывод в консоль:
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/
        char symbol='*';
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(symbol + " ");
            }
            System.out.println("");
        }
    }
}
