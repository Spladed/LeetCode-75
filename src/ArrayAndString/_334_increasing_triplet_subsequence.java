package ArrayAndString;

public class _334_increasing_triplet_subsequence {

    /**
     * 解法1: 参考_238_product_of_array_except_self
     * 假如nums中有满足 nums[j] < nums[i] < nums[k]，那么我们可以维护两个数组left和right
     * left记录元素i左侧的最小元素
     * right记录了元素i右侧的最大元素
     * 最后遍历nums，只要left[i] < nums[i] < right[i]，就可以返回true
     */
    public static boolean increasingTriplet(int[] nums) {
        var length = nums.length;
        if (length < 3) return false;

        var left = new int[length];
        left[0] = nums[0];
        for (var i = 1; i < length; i++) {
            left[i] = Math.min(left[i - 1], nums[i]);
        }

        var right = new int[length];
        right[length - 1] = nums[length - 1];
        for (var i = length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], nums[i]);
        }

        for (var i = 1; i < length; i++) {
            if (left[i] < nums[i] && nums[i] < right[i])
                return true;
        }

        return false;
    }

    /**
     * 解法2: 贪心算法
     * 设定first < second < third
     * 先把first初始化为第一个值， second初始化为最大INT， 然后在nums里找third
     * 有值比first还小，那就更新first的值
     * 如果有值比first大，但是比second小，那就更新second的值
     * 如果比second还大，那就找到正确的third里
     * 注意，如果在更新second后，又更新了first（称之为first'），虽然此时first'在数组中位于当前second的后面，但由于原来的first还在，所以只要能找到third，原来的first也满足关系
     */
    public static boolean increasingTriplet2(int[] nums) {
        if (nums.length < 3) return false;

        var first = nums[0];
        var second = Integer.MAX_VALUE;

        for (var third : nums) {
            if (third <= first) {
                first = third;
            } else if (third <= second) {
                second = third;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var nums = new int[]{20, 100, 10, 12, 5, 13};
        var result = increasingTriplet(nums);
        System.out.println(result);
    }

}
