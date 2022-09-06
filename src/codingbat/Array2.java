package codingbat;

public class Array2 {

    public static void main(String[] args) {

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
