package task3;

public class task3 {
    public static void main(String[] args) {
        int x = 9;
        String text = new String("Text");
        //System.out.println("Hello");
        String text2 = "Text2";
        System.out.println(text);
        System.out.println(text2);

        System.out.println(text2.concat(text));
        System.out.println("======================");
        //+ equals concat
        System.out.println(text2 + " " + text);
        System.out.println("======================");
        System.out.println(text);
        System.out.println(text2);
        System.out.println("======================");
        String text3 = text2 + " " + text;
        System.out.println(text3);
        System.out.println("======================");
        text2 = text2 + text;
        System.out.println(text2);

        //contact 2 part
        System.out.println("======================");
        System.out.println(text + " " + 12 + " " + (13 < 2));
        String numberString = "250";
        int number = Integer.parseInt(numberString);
        System.out.println(number<300);


        //valueOf()
        String numberString2 = String.valueOf(number);
        System.out.println(numberString2+20);
        System.out.println(250+ 20);

        //символы экранирования \n \b
        System.out.println("============");
        String textB = "My random \ntext = \"Test1\" !!\b\b";
        System.out.println(textB);

        //length()
        System.out.println("============");
        String forLength = "I a the best!";
        int length = forLength.length();
        System.out.println("The length of the string forLength = " + length);
        System.out.println("The length of the string 'forLength' = " + forLength.length());

        //contains()
        System.out.println("=============");
        String greetingText = "Nice to meet you, Ivan :)";
        boolean resultContains = greetingText.contains("Ivan");
        boolean resultContains2 = greetingText.contains("Denis");
        System.out.println(resultContains);
        System.out.println(resultContains2);


        //System.out.print
        System.out.print("=============");
        System.out.println("=============");
        System.out.print("=============\n");

        //charAt
        String greetingText2 = "Nice to meet you, Ivan :)";
        System.out.println(greetingText2.charAt(0));
        System.out.println(greetingText2.charAt(greetingText2.length()-1));

        //indexOf() lastIndexOf()
        System.out.println("=============");
        String example = "qwertye";
        System.out.println(example.indexOf("e"));
        System.out.println(example.indexOf("e",3));
        System.out.println(example.lastIndexOf("e"));

        //substring()
        System.out.println("=============");
        String forSubString = "The length of the string 'forLength' = qfqfq";
        System.out.println(forSubString.substring(4));
        System.out.println(forSubString.substring(4, 33));
        System.out.println(forSubString.substring(forSubString.length()-5));

        //replace()
        System.out.println("==============");
        String forSubString2 = "The length of the string 'forLength' = qfqfq";
        System.out.println(forSubString2.replace("string", "XXX")
                .replace("The fssfbs", ""));

        //equals
        System.out.println("============");
        int a = 9;
        int b = 9;
        boolean intResult = a == b;
        String one = "MyStrings";
        String two = "MyString";
        // boolean stringResult = one == two;
        boolean stringResult = one.equals(two);
        System.out.println(stringResult);

        //startsWith(), endsWith()
        System.out.println("============");
        String forStartWithAndEndWith = "The length of the string 'forLength' = qfqfq";
        System.out.println(forStartWithAndEndWith.startsWith("the"));
        System.out.println(forStartWithAndEndWith.endsWith("The length of the string 'forLength' = qfqfq"));

        //toLowerCase(), toUpperCase()
        String upperCaseText = "WIUHEWbjbiuqwbiuiuIU kjhjk";
        upperCaseText = upperCaseText.toLowerCase();
        System.out.println(upperCaseText);

        String lowerCaseText = "lksdnllds@n kdlskn lskd@sl kKKLLK LKJLK";
        lowerCaseText = lowerCaseText.toUpperCase();
        System.out.println(lowerCaseText);

        //equalsIgnoreCase()
        String lowerCase = "stop";
        String upperCAse = "STOP";
        System.out.println(lowerCase.equalsIgnoreCase(upperCAse));

        //trim
        String spasceString = "  ;lacs;asc;ajac  ";
        System.out.println(spasceString.trim());

        System.out.println("======================");
        //split
        String forSplitMethod = "One two three twotwofour";
        String[] stringSpace = forSplitMethod.split("two");
        int countOfStrings = stringSpace.length;
        System.out.println(countOfStrings);
        String fistElement = stringSpace[0];
        System.out.println(fistElement);
        String secondElement = stringSpace[1];
        System.out.println(secondElement);
        System.out.println(stringSpace[2]);
        System.out.println(stringSpace[3]);

    }
}