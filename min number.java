package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Enter 5 Numbers");

        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }

        int min = number[0];
        for (int i = 0; i < 5; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }

        System.out.println("minimum Number :" + min);

    }
}
