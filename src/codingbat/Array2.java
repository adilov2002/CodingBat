package codingbat;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        fizzBuzz(1, 4);
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] res = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                res[i - start] = "Fizz";
            }
            if (i % 5 == 0) {
                if (res[i - start] == null) {
                    res[i - start] = "Buzz";
                    continue;
                }
                res[i - start] += "Buzz";
            }
            if (res[i - start] == null) {
                res[i - start] = String.valueOf(i);
            }
        }
        return res;
    }

    public static int[] evenOdd(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[j] = num;
                j++;
            }
        }
        for (int num : nums) {
            if (num % 2 == 1) {
                res[j] = num;
                j++;
            }
        }
        return res;

    }

    public static int[] zeroMax(int[] nums) {
        int largeOdd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                largeOdd = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 1 && nums[j] > largeOdd) {
                        largeOdd = nums[j];
                    }
                }
                if (largeOdd == 0) {
                    break;
                } else {
                    nums[i] = largeOdd;
                }
            }
        }
        return nums;
//        int zeroId = -1;
//        int largeOdd = 0;
//        boolean found = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (found && nums[i] % 2 == 1 && nums[i] > largeOdd) {
//                largeOdd = nums[i];
//            }
//            if (found && nums[i] == 0) {
//                nums[zeroId] = largeOdd;
//                zeroId = i;
//                found = false;
//                largeOdd = 0;
//            }
//            if (nums[i] == 0) {
//                zeroId = i;
//                found = true;
//            }
//            if (found && i == nums.length - 1) {
//                nums[zeroId] = largeOdd;
//            }
//        }
//        return nums;
    }

    public static int[] withoutTen(int[] nums) {
        for (int f = 0, p = nums.length - 1; f < nums.length;) {
            int temp;
            if (p <= f && nums[f] == 10) {
                nums[f] = 0;
                f++;
                continue;
            }
            if (nums[f] != 10) {
                f++;
            } else if (nums[f] == 10 && nums[p] != 10) {
                temp = nums[f];
                nums[f] = nums[p];
                nums[p] = temp;
                f++;
                p--;
                if (nums[f] != 10) {
                    temp = nums[f - 1];
                    nums[f - 1] = nums[f];
                    nums[f] = temp;
                }
            } else if (nums[f] != 10 && nums[p] == 10) {
                p--;
            } else if (nums[f] == 10 && nums[p] == 10) {
                p--;
            }
        }
        return nums;
    }

    public static int[] zeroFront(int[] nums) {
        for (int f = 0, p = nums.length - 1; f < nums.length && p >= f;) {
            int temp;
            if (nums[f] == 0) {
                f++;
            } else if (nums[f] != 0 && nums[p] == 0) {
                temp = nums[f];
                nums[f] = nums[p];
                nums[p] = temp;
                f++;
                p--;
            } else if (nums[f] != 0 && nums[p] != 0) {
                p--;
            }
        }
        return nums;
    }

    public static int[] notAlone(int[] nums, int val) {
        if (nums.length < 3) {
            return nums;
        }
        for (int i = 1; i < nums.length - 1; i++) {
            int prev = nums[i - 1];
            int next = nums[i + 1];
            if (nums[i] == val && prev != val && next != val) {
                nums[i] = Math.max(prev, next);
            }
        }
        return nums;
    }

    public static int[] post4(int[] nums) {
        String arr = Arrays.toString(nums).replace("[", "").replace(", ", "").replace("]", "");
        int[] res;
        if (arr.contains("4")) {
            res = new int[arr.length() - arr.lastIndexOf("4") - 1];
        } else {
            res = new int[0];
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[arr.length() - res.length + i];
        }
        return res;
    }

    public static int[] pre4(int[] nums) {
        String arr = Arrays.toString(nums).replace("[", "").replace(", ", "").replace("]", "");
        int[] res;
        if (arr.contains("4")) {
            res = new int[arr.indexOf("4")];
        } else {
            res = new int[0];
        }
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[i];
        }
        return res;
    }

    public static int[] tenRun(int[] nums) {
        int[] res = new int[nums.length];
        boolean divisibleByTen = false;
        int divisibleByTenValue = 0;
        for (int i = 0; i < res.length; i++) {
            if (nums[i] % 10 == 0) {
                divisibleByTen = true;
                divisibleByTenValue = nums[i];
            }
            if (divisibleByTen) {
                res[i] = divisibleByTenValue;
                continue;
            }
            res[i] = nums[i];
        }
        return res;
    }

    public static int[] shiftLeft(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (i + 1 == nums.length) {
                res[nums.length - 1] = nums[0];
                break;
            }
            res[i] = nums[i + 1];
        }
        return res;
    }

    public static int[] fizzArray3(int start, int end) {
        int[] res = new int[end - start];
        for (int i = 0; i < res.length; i++) {
            res[i] = start + i;
        }
        return res;
    }

    public static boolean tripleUp(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if (nums.length == 1) {
                    return false;
                }
                if (i == nums.length - 1) {
                    if (nums[i - 1] != 2)
                        return false;
                } else if (nums[i + 1] == 2) {
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasThree(int[] nums) {
        int count = 0;
        if (nums.length < 5) {
            return false;
        }
        for (int i = 0; i < nums.length - 4; i++) {
            if (nums[i] == 3 && nums[i + 2] == 3 && nums[i + 4] == 3) {
                count++;
            }
        }
        return count == 1;
    }

    public static boolean modThree(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for (int num : nums) {
            if (num == 1) {
                has1 = true;
            }
            if (has1 && num == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean has77(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums[nums.length - 2] == 7 && nums[nums.length - 1] == 7) {
            return true;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7)) {
                return true;
            }
        }
        return false;
    }

    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff <= 2 && diff != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean either24(int[] nums) {
        int count2s = 0;
        int count4s = 0;
        boolean exists = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                count2s++;
                exists = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                count4s++;
                exists = true;
            }
        }
        return exists && (count2s <= 0 || count4s <= 0);
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) {
                return false;
            }
        }
        return true;
    }

    public static boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {
            if (num == 1) {
                count1++;
            }
            if (num == 4) {
                count4++;
            }
        }
        return count1 <= 0 || count4 <= 0;
    }

    public static String[] fizzArray2(int n) {
        String[] numsString = new String[n];
        for (int i = 0; i < numsString.length; i++) {
            numsString[i] = String.valueOf(i);
        }
        return numsString;
    }

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;
    }

    public static int[] fizzArray(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        return nums;
    }

    public static boolean more14(int[] nums) {
        int count1s = 0;
        int count4s = 0;
        for (int num : nums) {
            if (num == 1) {
                count1s++;
            } else if (num == 4) {
                count4s++;
            }
        }
        return count1s > count4s;
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return sum == 8;
    }

    public static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean isSix = false;
        for (int num : nums) {
            if (num == 6) {
                isSix = true;
                continue;
            }
            if (isSix && num == 7) {
                isSix = false;
                continue;
            }
            if (!isSix) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return sum;
        }
        if (nums[0] != 13) {
            sum += nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 13 || nums[i - 1] == 13) {
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }
        return (sum - max - min) / (nums.length - 2);
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    public static int countEvents(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
