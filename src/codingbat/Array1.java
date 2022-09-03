package codingbat;

public class Array1 {

    public static void main(String[] args) {

    }

    public static int[] front11(int[] a, int[] b) {
        int count = 0;
        int first = 0;
        int second = 0;
        if (a.length >= 1) {
            first = a[0];
            count++;
        }
        if (b.length >= 1) {
            second = b[0];
            count++;
        }
        int[] res = new int[count];
        if (count == 1 && a.length >= 1) {
            res[0] = first;
        } else if (count == 1) {
            res[0] = second;
        } else if (count == 2) {
            res[0] = first;
            res[1] = second;
        }
        return res;
    }

    public static int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        if (a.length >= 1) {
            res[0] = a[0];
        }
        if (a.length >= 2) {
            res[1] = a[1];
            return res;
        }
        if (a.length == 0 && b.length >= 1) {
            res[0] = b[0];
            res[1] = b[1];
            return res;
        }
        if (a.length == 1 && b.length >= 1) {
            res[1] = b[0];
            return res;
        }
        return res;
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length > 1 && ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) || (nums[1] == 1 && nums[2] == 3))) {
            return true;
        }
        return false;
    }

    public static int[] frontPiece(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        return new int[]{nums[0], nums[1]};
    }

    public static int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int mid = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        if (first > mid && first > last) {
            return first;
        } else if (mid > last) {
            return mid;
        } else {
            return last;
        }
    }

    public static int[] midThree(int[] nums) {
        return new int[]{
                nums[nums.length / 2 - 1],
                nums[nums.length / 2],
                nums[nums.length / 2 + 1]
        };
    }

    public static int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static int[] makeMiddle(int[] nums) {
        return new int[]{
                nums[nums.length / 2 - 1],
                nums[nums.length / 2]
        };
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = a[0] + a[1];
        int sum2 = b[0] + b[1];
        if (sum1 >= sum2) {
            return a;
        }
        return b;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            return new int[]{nums[0], 0, nums[2]};
        }
        if (nums[1] == 2 && nums[2] == 3) {
            return new int[]{nums[0], nums[1], 0};
        }
        return nums;
    }

    public static boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        return (nums[0] == 2 || nums[1] == 3) && nums[0] == nums[1];
    }

    public static int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
    }

    public static boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public static int[] makeEnds(int[] nums) {
        if (nums.length == 1) {
            return new int[]{nums[0], nums[0]};
        }
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[nums.length - 1];
        }
        return nums[0] + nums[1];
    }

    public static int[] maxEnd3(int[] nums) {
        int max;
        if (nums[0] < nums[2]) {
            max = nums[2];
        } else {
            max = nums[0];
        }
        return new int[]{max, max, max};
    }

    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

}
