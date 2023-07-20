package ua.hillel.sereda.homeworks.homework7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 11);

        int integer = -1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter from 0 to 10");
            if (scanner.hasNextInt()) {
                integer = scanner.nextInt();
                if (integer >= 0 && integer <= 10) {
                  if (randomNumber == integer) {
                      System.out.println("Winner!");
                      break;
                  } else {
                      if (i == 3) {
                          System.out.println("You loser!");
                      } else {
                          System.out.println("try again");
                      }
                  }
                } else {
                    System.out.println("FROM 0 to 10!!!");
                    scanner.nextLine();
                }
            }else {
                System.out.println("Wrong data! Try again");
                scanner.nextLine();
            }
        }
    }
}
