package TwoPointers;

import java.util.Arrays;

public class _283_move_zeroes {

    // solution 1
    public static void moveZeroes(int[] nums) {
        var length = nums.length;
        var left = 0;
        for (var right = 0; right < length; right++) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
        }
        for (; left < length; left++) {
            nums[left] = 0;
        }
    }

    // solution 2
    public static void moveZeroes2(int[] nums) {
        var length = nums.length;
        var left = 0;
        for (var right = 0; right < length; right++) {
            if (nums[right] != 0) {
                var temp = nums[right];
                nums[right] = nums[left];
                nums[left++] = temp;
            }
        }
    }

    public static void main(String[] args) {
        var nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

}
