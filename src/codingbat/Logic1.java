package codingbat;

public class Logic1 {

    public static void main(String[] args) {

    }

    public static int sumLimit(int a, int b) {
        String numA = String.valueOf(a);
        String sumAB = String.valueOf(a + b);
        if (numA.length() < sumAB.length()) {
            return a;
        }
        return a + b;
    }

    public static boolean shareDigit(int a, int b) {
        return a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b / 10 || a / 10 == b % 10;
    }

    public static int blueTicket(int a, int b, int c) {
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;
        if (sum1 == 10 || sum2 == 10 || sum3 == 10) {
            return 10;
        }
        if (sum1 == sum2 + 10 || sum1 == sum3 + 10) {
            return 5;
        }
        return 0;
    }
    
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        }
        if (a == b || b == c || a == c) {
            return 10;
        }
        return 0;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && a == b && a == c) {
            return 10;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
            } else {
                die1++;
            }
        }
        return die1 + die2;
    }

    public static boolean lessBy10(int a, int b, int c) {
        //return (Math.abs(a - b) >= 10 ||  their solution
        //Math.abs(b - c) >= 10 ||
        //Math.abs(a - c) >= 10);
        return a - b >= 10 || b - c >= 10 || a - c >= 10 || b - a >= 10 || c - a >= 10 || c - b >= 10;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk && b >= a && c >= b) {
            return true;
        }
        return bOk && c > b;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static String fizzString2(int n) {
        String res = "";
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        }
        if (n % 3 == 0) {
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return n+"!";
    }

    public static String fizzString(String str) {
        String res = "";
        if (str.startsWith("f")) {
            res += "Fizz";
        }
        if (str.endsWith("b")) {
            res += "Buzz";
        }
        if (res.isEmpty()) {
            res += str;
        }
        return res;

    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || tea * 2 <= candy) {
            return 2;
        }
        return 1;

    }

    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static boolean answerCall(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMom) {
            return true;
        }
        return !isMorning;
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public static boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public static boolean old35(int n) {
        return (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0);
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode && (n <= 1 || n >= 10)) {
            return true;
        }
        return !outsideMode && (n >= 1 && n <= 10);
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (a - b == 6) {
            return true;
        }
        if (b - a == 6) {
            return true;
        }
        return false;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day <= 5 && day >= 1) {
                return "7:00";
            }
            return "10:00";
        }
        if (day <= 5 && day >= 1) {
            return "10:00";
        }
        return "off";
    }

    public static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        }
        return a + b;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            if (speed <= 65) {
                return 0;
            }
            if (speed <= 85) {
                return 1;
            }
            return 2;
        }
        if (speed <= 60) {
            return 0;
        }
        if (speed <= 80) {
            return 1;
        }
        return 2;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        }
        if (temp >= 60 && temp <= 100 && isSummer) {
            return true;
        }
        return false;
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you > 8 || date > 8) {
            return 2;
        }
        return 1;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        }
        if (cigars >= 40 && isWeekend) {
            return true;
        }
        return false;
    }

}
