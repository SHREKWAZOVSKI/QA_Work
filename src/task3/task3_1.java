package task3;

public class task3_1 {
    public static void main(String[] args) {
           /*    1) Создать пять любых переменных типа String ( word1, word2, word3 и т.д. ).
Создать также переменную типа String result1 и result2.
Поместить в result1 все слова word1 - word5 используя метод concat.
Поместить в result2 все слова word1 - word5 используя оператор +.
Вывести result1 и result2 в консоль.
*/
        String word1="abc", word2="efg", word3="hig", word4="opq", word5="rst";
        String result1, result2;
        result1 = word1.concat(word2).concat(word3).concat(word4).concat(word5);
        result2 = word1 + word2 + word3 + word4 + word5;

        System.out.println(result1);
        System.out.println(result2);
    }
}