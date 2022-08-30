package codingbat;

import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder res = new StringBuilder();
        if (str.length() == word.length()) {
            return "";
        }
        for (int i = 0; i < str.length(); i++) {
            int aim = str.indexOf(word, i);
            i = aim;
            if (aim == 0) {
                i = word.length() - 1;
                res.append(str.charAt(i + 1));
                System.out.println(i);
                continue;
            } else if (aim == -1) {
                break;
            }
            res.append(str.charAt(aim - 1));
            if (i + word.length() < str.length()) {
                res.append(str.charAt(i + word.length()));
            }
        }
        return res.toString();
    }

    public static String plusOut(String str, String word) {
        String changed = str.replace(word, "*");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < changed.length(); i++) {
            if (changed.charAt(i) != '*') {
                res.append("+");
            } else {
                res.append(changed.charAt(i));
            }
        }
        res = new StringBuilder(res.toString().replace("*", word));
        return res.toString();
    }

    public static String starOut(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                i = i + 2;
            } else if (str.charAt(i) == '*') {
                i = i + 1;
            } else if (i > 1 && str.charAt(i - 1) == '*') {

            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static String starOutShitAnswer(String str) {
        if (!str.contains("*")) {
            return str;
        }
        if ((str.length() == 1 && str.contains("*")) || (str.length() == 3 && str.charAt(1) == '*')) {
            return "";
        }
        if (str.charAt(str.length() - 1) == '*') {
            str = str.substring(0, str.length() - 2);
        }
        String[] strArray = str.split("\\*");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].isEmpty()) {
                if (!strArray[i + 1].isEmpty()) {
                    strArray[i + 1] = strArray[i + 1].substring(1);
                }
                continue;
            } else {
                if (!strArray[i + 1].isEmpty()) {
                    strArray[i] = strArray[i].substring(0, strArray[i].length() - 1);
                    strArray[i + 1] = strArray[i + 1].substring(1);
                }
            }
            if (strArray[i + 1].isEmpty()) {
                strArray[i] = strArray[i].substring(0, strArray[i].length() - 1);
            }
        }
        for (String s : strArray) {
            res.append(s);
        }
        return res.toString();
    }

    public static String zipZap(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.length() > 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res.append(str.charAt(i)).append(str.charAt(i + 2));
                i = i + 2;
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static String oneTwo(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += 3) {
            if (i + 2 < str.length()) {
                res.append(str.charAt(i + 1)).append(str.charAt(i + 2)).append(str.charAt(i));
            }
        }
        return res.toString();
    }

    public static boolean sameChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static String getSandwich(String str) {
        if (str.indexOf("bread") < str.lastIndexOf("bread")) {
            return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        }
        return "";
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int mid = str.indexOf("xyz", str.length() / 2 - 3);
        int leftCount = str.substring(0, mid).length();
        int rightCount = str.substring(mid + 3).length();
        return leftCount == rightCount || leftCount == rightCount + 1 || leftCount + 1 == rightCount;
    }

    public static boolean prefixAgain(String str, int n) {
        return str.indexOf(str.substring(0, n)) != str.lastIndexOf(str.substring(0, n));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                res.append(word);
                break;
            }
            res.append(word).append(sep);
        }
        return res.toString();
    }

    public static String repeatFront(String str, int n) {
        if (n == 1) {
            return str.substring(0, n);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(str.substring(0, n - i));
        }
        return res.toString();
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(str.substring(str.length() - n));
        }
        return res.toString();
    }

    public static String mixString(String a, String b) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (a.length() > i) {
                res.append(a.charAt(i));
            }
            if (b.length() > i) {
                res.append(b.charAt(i));
            }
        }
        return res.toString();
    }

    public static boolean xyBalance(String str) {
        return !str.contains("x") || str.contains("x") && str.contains("y") && str.lastIndexOf('x') < str.lastIndexOf('y');
    }

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("xyz")) {
                return true;
            }
            if (str.charAt(i) != '.' && str.startsWith("xyz", i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.startsWith("cat", i)) {
                cats++;
            }
            if (str.startsWith("dog", i)) {
                dogs++;
            }
        }
        return cats == dogs;
    }

    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String twoLetters = str.substring(i, i + 2);
            if (twoLetters.equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        for (char letter : str.toCharArray()) {
            res.append("").append(letter).append(letter);
        }
        return res.toString();
    }

}
