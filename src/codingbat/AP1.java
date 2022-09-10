package codingbat;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

    public static void main(String[] args) {
        AP1 ap1 = new AP1();
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int nameCompare = aName.compareTo(bName);
        if (nameCompare < 0) {
            return -1;
        } else if (nameCompare > 0) {
            return 1;
        } else return Integer.compare(aId, bId);
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }
        return count;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (heights[i + 1] > heights[i]) {
                sum += Math.abs(heights[i] - heights[i + 1]) * 2;
                continue;
            }
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int scoresSpecial(int[] a, int[] b) {
        int largest1 = getLargest(a);
        int largest2 = getLargest(b);
        return largest1 + largest2;
    }
    public int getLargest(int[] arr) {
        int largest = 0;
        for (int j : arr) {
            if (j % 10 == 0 && j > largest) {
                largest = j;
            }
        }
        return largest;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }
        String[] res = new String[count];
        for (int i = 0, index = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                res[index++] = words[i];
            }
        }
        return res;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            } else if(answers[i].equals("?")) {
                continue;
            } else {
                score += -1;
            }
        }
        return score;
    }

    public int matchUP(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].isEmpty() || b[i].isEmpty()) {
                continue;
            }
            if (a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] res = new int[count];
        for (int i = 0, index = 0; i < nums.length && count > 0; i++) {
            if ((nums[i] >= 90 && nums[i] <= 100) || (nums[i] >= 0 && nums[i] <= 10)) {
                res[index++] = nums[i];
                count--;
            }
        }
        return res;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] res = new int[count];
        for (int i = 0, index = 0; i < nums.length && count > 0; i++) {
            if (nums[i] % 2 == 0) {
                res[index++] = nums[i];
                count--;
            }
        }
        return res;
    }

    public boolean dividesSelf(int n) {
        String numString = String.valueOf(n);
        if (numString.contains("0")) {
            return false;
        }
        for (int i = 0; i < numString.length(); i++) {
            int num = Integer.parseInt(numString.substring(i, i + 1));
            if (n % num != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean hasOne(int n) {
        String numString = String.valueOf(n);
        return numString.contains("1");
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> res = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) {
                res.add(word);
            }
        }
        return res;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] res = new String[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = words[i];
        }
        return res;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String word : words) {
            if (word.length() == len) {
                count++;
            }
        }
        return count;
    }

    public int scoresAverage(int[] scores) {
        int average1 = 0;
        int average2 = 0;
        for (int i = 0, j = scores.length - 1; i <= scores.length / 2 && j >= scores.length / 2; i++, j--) {
            average1 += scores[i];
            average2 += scores[j];
        }
        average1 = average1 / (scores.length / 2);
        average2 = average2 / (scores.length / 2);
        return Math.max(average1, average2);
    }

    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) {
            return false;
        }
        for (int i = 0; i < scores.length - 2; i++) {
            if (scores[i] <= scores[i + 1] && scores[i + 1] <= scores[i + 2] && scores[i + 2] - scores[i] <= 2) {
                return true;
            }
        }
        return false;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++){
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
