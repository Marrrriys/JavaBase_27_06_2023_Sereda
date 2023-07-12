package ua.hillel.sereda.homeworks.homework5;

public class Main5 {
    public static void main(String[] args) {

        int LiWarrior = 13;
        int LiBowman = 24;
        int LiRider = 46;

        int MinWarrior = 9;
        int MinBowman = 35;
        int MinRider = 12;

        int LiGenWar = 860;
        int MinGenWar = 1290;

        int LiGenWarrior = LiGenWar *  LiWarrior;
        int LiGenBowman =  LiGenWar * LiBowman;
        int LiGenRider = LiGenWar * LiRider;

        int MinGenWarrior = MinGenWar *  MinWarrior;
        int MinGenBowman =  MinGenWar * MinBowman;
        int MinGenRider = MinGenWar * MinRider;

        int LiGenAttack = LiGenWarrior + LiGenBowman + LiGenRider;
        int MinGenAttack = MinGenWarrior + MinGenBowman + MinGenRider;

        int GenAttack = LiGenAttack + MinGenAttack;


        System.out.println(" LiGenWarrior = " + LiGenWarrior);
        System.out.println(" LiGenBowman = " + LiGenBowman);
        System.out.println(" LiGenRider = " + LiGenRider);

        System.out.println(" MinGenWarrior = " + MinGenWarrior);
        System.out.println(" MinGenBowman = " + MinGenBowman);
        System.out.println(" MinGenRider = " + MinGenRider);

        System.out.println(" LiGenAttack = " + LiGenAttack);
        System.out.println(" MinGenAttack = " + MinGenAttack);

        System.out.println(" GenAttack = " + GenAttack);

    }
}
