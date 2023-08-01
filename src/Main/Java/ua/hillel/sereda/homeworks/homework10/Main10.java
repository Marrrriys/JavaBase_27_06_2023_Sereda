package ua.hillel.sereda.homeworks.homework10;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {

        int[] array1 = new int[7];
        int[] array2 = new int[7];

        int index = -1;


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            Arrays.sort(array1);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);
            Arrays.sort(array2);
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == array1[i]) {
                index = i;

            System.out.println("index :" + index);
        }
    }
}
    }



