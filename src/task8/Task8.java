package task8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        int[] mainArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printNumbers(mainArray);
    }

    public static void printNumbers (int[] someArray){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int value : someArray){
            if (value%2==0){
                evenNumbers.add(value);
            }
            else {
                oddNumbers.add(value);
            }
        }

        System.out.println("Парные числа: " + evenNumbers);
        System.out.println("Непарные числа: " + oddNumbers);
    }
}
