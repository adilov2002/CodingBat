package codingbat;

public class Logic2 {
    public static void main(String[] args) {

    }

    public static boolean makeBricks(int small, int big, int goal) {
        if (big * 5 == goal || small == goal || big == goal || (big <= goal && small >= goal)) {
            return true;
        }
        int current = big * 5;
        if (current < goal) {
            if (current + small >= goal) {
                return true;
            }
        }
        if (current > goal) {
            if (goal % 5 <= small) {
                return true;
            }
            return current % goal == 5;
        }
        return false;
    }
}