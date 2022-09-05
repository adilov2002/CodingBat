package codingbat;

public class String3 {

    public static void main(String[] args) {

    }

    public static String notReplace(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        if (str.equals("is")) {
            return str + " not";
        }
        if (str.startsWith("is") && !Character.isLetter(str.charAt(2))) {
            res.append("is not");
            i = 2;
        }

        for (; i < str.length(); i++) {
            if (i == str.length() - 3 && !Character.isLetter(str.charAt(i)) && str.substring(i + 1, i + 3).equals("is")) {
                res.append(str.charAt(i));
                res.append("is not");
                break;
            }
            if (!Character.isLetter(str.charAt(i)) && !Character.isLetter(str.charAt(i + 3)) && str.substring(i + 1, i + 3).equals("is")) {
                res.append(str.charAt(i));
                res.append("is not");
                i = i + 2;
                continue;
            }
            res.append(str.charAt(i));
        }
        return res.toString();
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                for (int j = i; j < str.length(); j++) {
                    if (i == str.length() - 1  && Character.isDigit(str.charAt(j))) {
                        sum += Integer.parseInt(str.substring(i, j + 1));
                        break;
                    }
                    if (i != str.length() - 1 && j == str.length() - 1 && Character.isDigit(str.charAt(j))) {
                        sum += Integer.parseInt(str.substring(i, j + 1));
                        i = j;
                        break;
                    }
                    if (!Character.isDigit(str.charAt(j))) {
                        sum += Integer.parseInt(str.substring(i, j));
                        i = j;
                        break;
                    }
                }
            }
        }
        return sum;
    }

    public static int maxBlock(String str) {
        String largest = "";
        boolean isBlock = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    break;
                }
                if (str.charAt(i) == str.charAt(j) && str.substring(i, j + 1).length() > largest.length()) {
                    isBlock = true;
                    largest = str.substring(i, j + 1);
                }
            }
        }
        if (!isBlock && str.length() > 0) {
            return 1;
        }
        return largest.length();
    }

    public static String mirrorEnds(String string) {
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = string.length() - 1; i < string.length() && j >= 0; i++, j--) {
            if (string.charAt(i) != string.charAt(j)) {
                break;
            }
            res.append(string.charAt(i));
        }
        return res.toString();
    }

    public static String sameEnds(String string) {
        String res = "";
        for (int i = 1, j = string.length() - 1; i <= string.length() / 2 && j >= string.length() / 2; i++, j--) {
            if (string.substring(0, i).equals(string.substring(j))) {
                res = string.substring(0, i);
            }
        }
        return res;
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i)+"");
            }
        }
        return Math.max(sum, 0);
    }

    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String part = str.substring(i, i + 3);
            if (part.charAt(0) == part.charAt(1) && part.charAt(1) == part.charAt(2)) {
                count++;
            }
        }
        return count;
    }

    public static boolean gHappy(String str) {
        if (str.equals("g")) {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (i == str.length() - 2 && str.charAt(i) != 'g' && str.charAt(i + 1) == 'g') {
                return false;
            }
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                return false;
            }
        }
        return true;
    }

    public static boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if ("is".length() + i <= str.length() && str.substring(i, "is".length() + i).equals("is")) {
                countIs++;
            } else if ("not".length() + i <= str.length() && str.substring(i, "not".length() + i).equals("not")) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    public static String withoutString(String base, String remove) {
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < base.length(); j++) {
            if (remove.length() + j <= base.length() && base.substring(j, remove.length() + j).equalsIgnoreCase(remove)) {
                j = j + remove.length() - 1;
                continue;
            }
            res.append(base.charAt(j));
        }
        return res.toString();

//        String[] baseArray = base.split(" ");
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < baseArray.length; i++) {
//            String word = baseArray[i];
//            if (word.length() >= remove.length()) {
//                StringBuilder replaced = new StringBuilder();
//                for (int j = 0; j < word.length(); j++) {
//                    if (remove.length() + j <= word.length() && word.substring(j, remove.length() + j).equalsIgnoreCase(remove)) {
//                        j = j + remove.length() - 1;
//                        continue;
//                    }
//                    replaced.append(word.charAt(j));
//                }
//                baseArray[i] = replaced.toString();
//                if (baseArray[i].length() != 0) {
//                    res.append(baseArray[i]).append(" ");
//                }
//            } else {
//                res.append(baseArray[i]).append(" ");
//            }
//        }
//        return res.toString();
    }

    public static int countYZ(String str) {
        str = str.trim().toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    count++;
                break;
            }
            if (!Character.isLetter(str.charAt(i + 1)) && (str.charAt(i) == 'y' || str.charAt(i) == 'z')) {
                count++;
            }
        }
        return count;

//        String[] arr = str.trim().toLowerCase().split(" ");
//        int count = 0;
//        for (String word : arr) {
//            if (word.endsWith("y") || word.endsWith("z")) {
//                count++;
//            }
//        }
//        return count;
    }

}
