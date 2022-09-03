package codingbat;

public class String3 {

    public static void main(String[] args) {
        System.out.println(countYZ("yak zak"));
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
