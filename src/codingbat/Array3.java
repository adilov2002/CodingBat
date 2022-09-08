package codingbat;

public class Array3 {

    public static void main(String[] args) {

    }

    public static int maxMirror(int[] nums) {
        if (nums.length < 2) { // [], [8] -> length;
            return nums.length;
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - i - 1]) {
                for (int j = i, p = nums.length - 1; j < nums.length; j++, p--) {
                    if (j == p) {
                        count = count * 2 + 1;
                        break;
                    }
                    if (nums[j] == nums[p]) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }

    public static int[] seriesUp(int n) {
        int[] res = new int[(n * (n + 1)) / 2];
        int count = 0;
        int chet = 1;
        for (int i = 0; i < res.length; i++) {
            if (count <= n) {
                res[i] = ++count;
            }
            if (chet == count) {
                count = 0;
                chet++;
            }
        }
        return res;
    }

    public static int[] squareUp(int n) {
        int[] res = new int[n * n];
        int count = 1;
        int chet = n;
        for (int i = res.length - 1; i >= 0; i--) {
            if (i % n == 0) {
                count = 1;
                chet--;
            }
            if (count >= 1 && i % n != 0) {
                if (chet < count) {
                    res[i] = 0;
                } else {
                    res[i] = count;
                    count++;
                }
            } else if (i == res.length - n) {
                res[i] = n;
            }
        }
        return res;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        for (int i = 0, j = 0; i < outer.length && j < inner.length; i++) {
            if (outer[i] == inner[j]) {
                count++;
                j++;
            }
        }
        return count == inner.length;
    }

    public static boolean canBalance(int[] nums) {
        boolean canSplit = false;
        if (nums.length < 2) {
            return false;
        }
        for (int i = nums.length / 2; i > 0; i--) {
            int sumFront = 0;
            int sumBack = 0;
            for (int k = 0, l = i + 1; ; k++, l++) {
                if (k <= i) {
                    sumFront += nums[k];
                }
                if (l < nums.length) {
                    sumBack += nums[l];
                }
                if (k > i && l >= nums.length) {
                    break;
                }
            }
            if (sumFront == sumBack) {
                canSplit = true;
                break;
            }
        }
        if (!canSplit) {
            for (int i = nums.length / 2 - 1; i < nums.length - 1; i++) {
                int sumFront = 0;
                int sumBack = 0;
                for (int k = 0, l = i + 1; ; k++, l++) {
                    if (k <= i) {
                        sumFront += nums[k];
                    }
                    if (l < nums.length) {
                        sumBack += nums[l];
                    }
                    if (k > i && l >= nums.length) {
                        break;
                    }
                }
                if (sumFront == sumBack) {
                    canSplit = true;
                    break;
                }
            }
        }
        return canSplit;


//        int sumFront = nums[0];
//        int sumBack = nums[nums.length - 1];
//        boolean canSplit = false;
//        for (int i = 0, j = nums.length - 1; i + 1 != j; ) {
//            if (sumFront == sumBack && i + 1 == j) {
//                canSplit = true;
//                break;
//            }
//            if (nums[i] == nums[j]) {
//                sumFront += nums[i];
//                sumBack += nums[j];
//                i++;
//                j--;
//            } else if (sumFront < sumBack) {
//                sumFront += nums[i];
//                i++;
//            } else if (sumFront > sumBack) {
//                sumBack += nums[j];
//                j--;
//            }
//        }
//        return canSplit;
    }

    public static int[] fix45(int[] nums) {
        int temp = 0;
        int place = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                place = i + 1;
                for (int j = place; j < nums.length; j++) {
                    if (nums[j] == 5) {
                        temp = nums[j];
                        nums[j] = nums[place];
                        nums[place] = temp;
                        i++;
                        break;
                    }
                }
            } else if (nums[i] == 4 && nums[i + 1] == 5) {
                i = i + 2;
            } else if (nums[i] == 5) {
                place = i;
                for (int j = place + 1; j < nums.length; j++) {
                    if (nums[j - 1] == 4 && nums[j] != 5) {
                        temp = nums[j];
                        nums[j] = nums[place];
                        nums[place] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static int[] fix34(int[] nums) {
        int temp = 0;
        int place = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                place = i + 1;
                for (int j = place; j < nums.length; j++) {
                    if (nums[j] == 4) {
                        temp = nums[j];
                        nums[j] = nums[place];
                        nums[place] = temp;
                        i++;
                        break;
                    }
                }
            } else if (nums[i] == 4) {
                place = i;
                for (int j = place; j < nums.length; j++) {
                    if (nums[j - 1] == 3 && nums[j] != 4) {
                        temp = nums[j];
                        nums[j] = nums[place];
                        nums[place] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static int maxSpan(int[] nums) {
        int maxCount = 0;
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = nums.length - 1; j >= 0; j--) {
                int count = j - i + 1;
                if (nums[j] == curr && count > maxCount) {
                    maxCount = count;
                }
            }
        }
        return maxCount;
    }

}
