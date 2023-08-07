package ua.hillel.sereda.homeworks.homework12;

public class Main12 {
    public static void main(String[] args) {

        System.out.println(ackermann(3, 2));
    }

    static int ackermann(int m, int n) {
        if (m == 0) {
            return n += 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m -= 1, 1);
        } else {
            return ackermann(m -= 1, ackermann (m, n -= 1));
        }
    }
}

