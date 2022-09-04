package codingbat;

public class String3 {

    public static void main(String[] args) {
        System.out.println(withoutString("Hellollo there", "llo"));
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
