package codingbat;

public class String2 {
    public static void main(String[] args) {

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
