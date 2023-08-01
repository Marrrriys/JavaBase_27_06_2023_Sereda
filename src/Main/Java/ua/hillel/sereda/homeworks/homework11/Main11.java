package ua.hillel.sereda.homeworks.homework11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = -1;

        while (true) {
            System.out.println("Please enter integer from 1 to 10");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 1 && N <= 10) {
                    break;
                } else {
                    System.out.println("FROM 1 TO 10!!!!!!!!!");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Try again ");
                scanner.nextLine();
            }
        }
        System.out.println("N: " + N);

        int M = -1;
        while (true) {
            System.out.println("Please  second enter integer from 1 to 10");
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M >= 1 && M <= 10) {
                    break;
                } else {
                    System.out.println("FROM 1 TO 10!!!!!!!!!");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Try again ");
                scanner.nextLine();
            }
        }
        System.out.println("M: " + M);

        int[][] array = new int[N][M];
        int[][] array2 = new int[M][N];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("BEFORE");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }
        System.out.println();
        System.out.println("AFTER");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
            }
        }








