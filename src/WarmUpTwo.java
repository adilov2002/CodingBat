public class WarmUpTwo {

    public static void main(String[] args) {
        System.out.println(last2("xaxxaxaaxx"));
    }

    public static int last2(String str) {
        int count = 0;
        if (str.length() < 2) {
            return count;
        }
        String target = str.substring(str.length() - 2, str.length());
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+2).equals(target)){
                count++;
            }
        }
        return count;
    }

    public static String stringSplosion(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length() + 1; i++) {
            res.append(str, 0, i);
        }
        return res.toString();
    }

    public static String stringBits(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static boolean doubleX(String str) {
        return str.length() >= 2 && str.indexOf('x') != str.length() - 1 && str.charAt(str.indexOf('x') + 1) == 'x';
    }

    public static int countXX(String str) {
        int count = 0;
        char[] strArray = str.toCharArray();

        if (str.isEmpty()) {
            return count;
        }

        for (int i = 1; i < strArray.length; i++) {
            if (strArray[i - 1] == 'x' && strArray[i] == 'x'){
                count++;
            }
        }

        return count;
    }

    public static String frontTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.length() < 3) {
                res.append(str);
                continue;
            }
            res.append(str, 0, 3);
        }
        return res.toString();
    }

    public static String stringTimes(String str, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(str);
        }
        return res.toString();
    }

}
