package ua.hillel.sereda.homeworks.homework12;

public class Person {
    public static void main(String[] args) {

        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes ", "London", "37742123513");

    }

    static void personInfo(String name, String surname, String town, String phon ) {
        System.out.println(name + " " + surname + " " + town + " " + phon);
    }
}