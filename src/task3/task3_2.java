package task3;

public class task3_2 {
    public static void main(String[] args) {
       /* Создать resumeStringName со значением:
        "Hello! My name is {NAME}.", а также переменную resumeStringCity со значением:
        "I am from {CITY}."

        Создать также переменную типа String result1 и result2.
        В result1 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
        {NAME} и {CITY} на ваше имя и город используя методы concat и substring.
        В result2 поместить значение resumeStringName и resumeStringCity и заменить внутри текст переменных
        {NAME} и {CITY} на ваше имя и город используя метод replace.
        Вывести в консоль сравнение на равенство двух переменных result1 и result2
                */
        String resumeStringName = "Hello! My name is {NAME}.";
        String resumeStringCity = "I am from {CITY}.";
        String result1, result2;

        result1 = resumeStringName.substring(0, resumeStringName.length()-7).concat("Kirill. ").
                concat(resumeStringCity.substring(0, resumeStringCity.length()-7)).concat("Irpen");

        result2 = resumeStringName.replace("{NAME}.", "Kirill. ").
                concat(resumeStringCity.replace("{CITY}.", "Irpen"));
        System.out.println(result1);
        System.out.println(result2);
    }
}