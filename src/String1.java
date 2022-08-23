public class String1 {

    public static void main(String[] args) {

    }

    public static String withoutX2(String str) {
        if (str.length() > 1 && str.charAt(1) == 'x') {
            str = str.replaceFirst(str.charAt(1)+"", "");
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str;
    }

    public static String withoutX(String str) {
        if (str.isEmpty()) {
            return str;
        }

        if (str.charAt(0) == 'x'){
            str = str.substring(1);
        }
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String startWord(String str, String word) {
        if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        return "";
    }

    public static String deFront(String str) {
        StringBuilder res = new StringBuilder();
        if (str.charAt(0) == 'a') {
            res.append('a');
        }
        if (str.charAt(1) == 'b') {
            res.append('b');
        }
        res.append(str.substring(2));
        return res.toString();
    }

    public static String without2(String str) {
        if (str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }

    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String front = str.substring(0, 2);
        return front + front + front;
    }

    public static String minCat(String a, String b) {
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        }
        if (b.length() < a.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b;
    }

    public static boolean frontAgain(String str) {
        return str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        }
        return "";
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public static String lastChars(String a, String b) {
        String res = "";
        if (a.length() == 0) {
            res += "@";
        } else {
            res += a.charAt(0);
        }
        if (b.length() == 0) {
            res += "@";
        } else {
            res += b.charAt(b.length() - 1);
        }
        return res;
//        return a.charAt(0) + b.charAt(b.length() - 1) + "";
    }

}
