package ArrayAndString;

import java.util.Arrays;

public class _238_product_of_array_except_self {

    /**
     * 解法1
     *
     * @param nums 整数数组
     * @return 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积
     */
    public static int[] productExceptSelf(int[] nums) {
        var length = nums.length;
        var left = new int[length];
        var right = new int[length];

        left[0] = 1;
        for (var i = 1; i < length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[length - 1] = 1;
        for (var i = length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        var result = new int[length];
        for (var i = 0; i < length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    /**
     * 解法2
     */
    public static int[] productExceptSelf2(int[] nums) {
        var length = nums.length;
        var result = new int[length];

        result[0] = 1;
        for (var i = 1; i < length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int temp = 1;
        for (var i = length - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 3, 4};
        var result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

}
