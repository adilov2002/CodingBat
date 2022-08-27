package codingbat;

import java.util.ArrayList;

public class WarmUpOne {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>() {{
            add("text");
            add("nottext");
            add("not text");
            add(" not text");
            add("    not    text");
            add("   text");
            add(" not not text");
        }};

        for (String string : strings) {
            System.out.println(frontBack(string));
        }

    }

    public static String everyNth(String str, int n) {
        if (str.length() < n) {
            return str.charAt(0) + "";
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        }

        int cut = str.length() - 3;

        String front = str.substring(0, cut);
        String back = str.substring(cut).toUpperCase();

        return front + back;
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public static boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e') {
                count++;
            }
        }

        return (count >= 1 && count <= 3);
    }

    public static int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (b <= 20 && b >= 10)) {
            return Math.max(a, b);
        } else if (a >= 10 && a <= 20) {
            return a;
        }
        else if  (b <= 20 && b >= 10) {
            return b;
        } else {
            return 0;
        }
    }

    public static boolean in3050(int a, int b) {
        return (a >= 30 && b >= 30 && a <= 40 && b <= 40)
                || (a >= 40 && b >= 40 && a <= 50 && b <= 50);
    }

    public static int close10(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == b || (a + b) / 2.0 == 10.0) {
            return 0;
        }

        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        }
        return b;
    }

    public static int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        return c;
    }

    public static String startOz(String str) {
        String res = "";
        if (str.isEmpty()){
            return res;
        }

        if (str.startsWith("oz")) {
            res = "oz";
        } else if (str.startsWith("o")) {
            res = "o";
        } else if (str.charAt(1) == 'z') {
            res = "z";
        }
        return res;
    }

    public static boolean mixStart(String str) {
        return str.length() > 3 && str.substring(1, 3).equals("ix");
    }

    public static String delDel(String str) {
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            return str.replace("del", "");
        }
        return str;
    }

    public static boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) != (b >= 13 && b <= 19);
    }

    public static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20) {
            return true;
        }
        if (b >= 10 && b <= 20) {
            return true;
        }

        return false;
    }

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100);
    }

    public static boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public static String front22(String str) {
        String front22;

        if (str.length() > 2) {
            front22 = str.substring(0, 2);
        } else {
            front22 = str;
        }

        return front22 + str + front22;
    }

    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public static String backAround(String str) {
        String lastChar = str.charAt(str.length() - 1) + "";
        return lastChar + str + lastChar;
    }

    public static String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        }
        String front = str.substring(0, 3);
        return front + front + front;
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + "" + str.substring(1, str.length() - 1) + "" + str.charAt(0);
    }

    public static String missingChar(String str, int n) {
        return str.replace(str.charAt(n) + "", "");
    }

    public static String notString(String str) {
        str = str.trim();
        if (str.length() < 3) {
            return "not " + str;
        }
        if (str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }
}
