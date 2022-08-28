package codingbat;

public class Logic2 {
    public static void main(String[] args) {

    }

    public static int makeChocolate(int small, int big, int goal) {
        int bigBar = big * 5;
        if (big == goal || bigBar == goal) {
            return 0;
        }
        if (bigBar < goal) {
            if (goal - bigBar <= small) {
                return goal - bigBar ;
            }
        } else {
            if (goal % 5 <= small) {
                return goal % 5;
            }
        }
        return -1;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int small = 0;
        int medium = 0;
        int large = 0;
        if (a < b) {
            if (a > c) {
                small = c;
                medium = a;
                large = b;
            } else if (b > c) {
                small = a;
                medium = c;
                large = b;
            } else {
                small = a;
                medium = b;
                large = c;
            }
        } else {
            if (b > c) {
                small = c;
                medium = b;
                large = a;
            } else if (a > c){
                small = b;
                medium = c;
                large = a;
            } else {
                small = b;
                medium = a;
                large = c;
            }
        }
        return medium - small == large - medium;
    }


    public static int blackjack(int a, int b) {
        int aVal = a;
        if (aVal > 21) {
            aVal = 0;
        }
        int bVal = b;
        if (bVal > 21) {
            bVal = 0;
        }
        return Math.max(aVal, bVal);
    }

    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
    }

    public static int round10(int n) {
        if (n % 10 >= 5) {
            return n + 10 - (n % 10);
        }
        return n - (n % 10);
    }

    public static int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);
        return a + b + c;
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        }
        return n;
    }

    public static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);
        return a + b + c;
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if (a == 13) {
            return sum;
        }
        sum += a;
        if (b == 13) {
            return sum;
        }
        sum += b;
        if (c == 13) {
            return sum;
        }
        sum += c;
        return sum;
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return a + b + c;
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