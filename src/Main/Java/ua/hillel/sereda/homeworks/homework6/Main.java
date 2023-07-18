package ua.hillel.sereda.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String team1 = scanner.nextLine();
        System.out.println("team1: " + team1);

        int team1Play1 = 0;
        if (scanner.hasNextInt()) {
            team1Play1 = scanner.nextInt();
        } else {
            System.out.println(team1Play1);
            System.exit(0);
        }
        System.out.println("team1Play1 = " + team1Play1);

        int team1Play2 = 0;
        if (scanner.hasNextInt()) {
            team1Play2 = scanner.nextInt();
        } else {
            System.out.println(team1Play2);
            System.exit(0);
        }
        System.out.println("team1Play2 = " + team1Play2);

        int team1Play3 = 0;
        if (scanner.hasNextInt()) {
            team1Play3 = scanner.nextInt();
        } else {
            System.out.println(team1Play3);
            System.exit(0);
        }
        System.out.println("team1Play3 = " + team1Play3);

        int team1Play4 = 0;
        if (scanner.hasNextInt()) {
            team1Play4 = scanner.nextInt();
        } else {
            System.out.println(team1Play4);
            System.exit(0);
        }
        System.out.println("team1Play4 = " + team1Play4);

        int team1Play5 = 0;
        if (scanner.hasNextInt()) {
            team1Play5 = scanner.nextInt();
        } else {
            System.out.println(team1Play5);
            System.exit(0);
        }
        System.out.println("team1Play5 = " + team1Play5);
        scanner.nextLine();


        String team2 = scanner.nextLine();
        System.out.println("team2: " + team2);;

        int team2Play1 = 0;
        if (scanner.hasNextInt()) {
            team2Play1 = scanner.nextInt();
        } else {
            System.out.println(team2Play1);
            System.exit(0);
        }
        System.out.println("team2Play1 = " + team2Play1);

        int team2Play2 = 0;
        if (scanner.hasNextInt()) {
            team2Play2 = scanner.nextInt();
        } else {
            System.out.println(team2Play2);
            System.exit(0);
        }
        System.out.println("team2Play2 = " + team2Play2);

        int team2Play3 = 0;
        if (scanner.hasNextInt()) {
            team2Play3 = scanner.nextInt();
        } else {
            System.out.println(team2Play3);
            System.exit(0);
        }
        System.out.println("team2Play3 = " + team2Play3);

        int team2Play4 = 0;
        if (scanner.hasNextInt()) {
            team2Play4 = scanner.nextInt();
        } else {
            System.out.println(team2Play4);
            System.exit(0);
        }
        System.out.println("team2Play4 = " + team2Play4);

        int team2Play5 = 0;
        if (scanner.hasNextInt()) {
            team2Play5 = scanner.nextInt();
        } else {
            System.out.println(team2Play5);
            System.exit(0);
        }
        System.out.println("team2Play5 = " + team2Play5);
        scanner.nextLine();

        int sumTeam1 = team1Play1 + team1Play2 + team1Play3 + team1Play4 + team1Play5;
        int sumTeam2 = team2Play1 + team2Play2 + team2Play3 + team2Play4 + team2Play5;

        int avgTeam1 = sumTeam1 / 5;
        int avgTeam2 = sumTeam2 / 5;
        System.out.println("avgTeam1 = " + avgTeam1);
        System.out.println("avgTeam2 = " + avgTeam2);

        if (sumTeam1 > sumTeam2) {
            System.out.println("Перемогла команда Team1 = " + sumTeam1 + " балів");
        } else if (sumTeam2 > sumTeam1) {
                System.out.println("Перемогла команда Team2 = " + sumTeam2 + " балів");
            } else {
                System.out.println("Гра нічия");
            }
        }
}





