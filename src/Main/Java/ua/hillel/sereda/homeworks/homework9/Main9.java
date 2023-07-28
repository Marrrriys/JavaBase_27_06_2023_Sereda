package ua.hillel.sereda.homeworks.homework9;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        int min = 18;
        int max = 40;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * (max - min + 1) + min);
        }
            System.out.println(Arrays.toString(team1));

            int sum1 = 0;
            for (int i = 0; i < team1.length; i++) {
                sum1 += team1[i];
            }
            int average1 = 0;
            average1 = sum1 /= team1.length;
                System.out.println("average1 = " + average1);



        for (int j = 0; j < team2.length; j++) {
            team2[j] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println(Arrays.toString(team2));

        double sum2 = 0;
        for (int j = 0; j < team2.length; j++) {
            sum2 += team2[j];
        }
        double average2 = 0;
        average2 = sum2 /= team2.length;
        System.out.println("average2 = " + average2);
     }
        }






