package ua.hillel.sereda.homeworks.homework8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        for (int i = 0; ; i++) {
            if (i / 10 == 4 || i % 10 == 4 || i / 10 == 9 || i % 10 == 9 || i % 100 / 10 == 4 || i % 100 % 10 == 4 || i % 100 / 10 == 9 || i % 100 % 10 == 9 || i / 100 == 4 || i / 100 == 9) {
                continue;
            }
            System.out.println(i);
            counter++;
            if (counter == 100) {
                break;
            }
        }
        System.out.println("counter =" + counter);
    }
}


