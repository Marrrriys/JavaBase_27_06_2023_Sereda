package ua.hillel.sereda.homeworks.homework6;

public class Main6 {
    public static void main(String[] args) {
        String team1 = "Redline";

        int Ra = 10;
        int Rb = 15;
        int Rc = 20;
        int Rd = 25;
        int Re = 30;

        int sumR = Ra + Rb + Rc + Rd + Re;

        int avgR = sumR / 5;

        String team2 = "Bluline";

        int Ba = 12;
        int Bb = 17;
        int Bc = 22;
        int Bd = 27;
        int Be = 32;

        int sumB = Ba + Bb + Bc + Bd + Be;

        int avgB = sumB / 5;

        System.out.println("avgR = " + avgR);
        System.out.println("avgB = " + avgB);

        if (avgR <= avgB) {
            System.out.println("Winner Bluline");
            if (avgR < avgB) {
                System.out.println("Winner Bluline!");
            } else {
                System.out.println("Winner Redline");
            }
        } else {
            System.out.println("Winner Redline!");
        }

        System.out.println("sumB = " + sumB);

        System.out.println("Перемогла команда " + "teamBluline " + "набрала " + "110 " + "очків ");
    }

}
