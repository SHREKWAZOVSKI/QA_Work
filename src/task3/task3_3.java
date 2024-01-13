package task3;

import java.util.Locale;

public class task3_3 {
    public static void main(String[] args) {
        /* Создать переменную string1 = "This line that i want to cut, cause it is too long".
           Создать строку string2 в которой должно быть помещено значение строки string1,
           Обрезанное до "This line that i want to cut, cause".
           Создать строку string3 на основе string2 которое будет содержать значение
           "This line that don't want to cut, cause it is perfect".
           Вывести на консоль каждое сообщение и его длину. */

        String string1 = "This line that I want to cut, cause it is too long";
        String string2 = string1.replace(" it is too long", "");
        System.out.println(string2 + " /// " + string2.length());
        String string3 = string2 + " it is perfect";
        System.out.println(string3 + " /// " + string3.length() + "\n============");

        /*Создать строку string = "Testing, is my favourite job".
        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Слово1 = (значение слова), Длина этого слова = (значение длины слов).
        Слово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.
        Вывести на консоль true, если первое слово длиннее остальных, в
        противном случае вывести false.*/

        String stringTask2 = "Testing, is my favourite job";

        String[] stringWords = stringTask2.split(" ");
        System.out.println("Слово 1 = " + stringWords[0] + ", Длина этого слова = " + stringWords[0].length());
        System.out.println("Слово 2 = " + stringWords[1] + ", Длина этого слова = " + stringWords[1].length());
        System.out.println("Слово 3 = " + stringWords[2] + ", Длина этого слова = " + stringWords[2].length());
        System.out.println("Слово 4 = " + stringWords[3] + ", Длина этого слова = " + stringWords[3].length());
        System.out.println("Слово 5 = " + stringWords[4] + ", Длина этого слова = " + stringWords[4].length());

        boolean theFirstWord = true;
        theFirstWord = stringWords[0].length() > stringWords[1].length() && stringWords[0].length() > stringWords[2].length()
                && stringWords[0].length() > stringWords[3].length() && stringWords[0].length() > stringWords[4].length();
        System.out.println(theFirstWord + "\n============");

        /* При применении к массиву строк поля length, можно узнать сколько элементов находится в массиве.
        Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
        то при вызове поля lenth:
        int size = arrayOfString.length;
        можно получить какое количество символов находится в данном массиве.

        Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
        символ 'a' встречается в  строке:
        "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method."
        Решить данную задачу с учетов верхнего и нижнего регистра символа 'a'. */

        String longText = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        longText=longText.toLowerCase(Locale.ROOT);

        String [] longTextEdited = longText.split("a");

        int countLetters = longTextEdited.length-1;
        System.out.println("Количество букв А в тексте равняется " + countLetters);
    }
}