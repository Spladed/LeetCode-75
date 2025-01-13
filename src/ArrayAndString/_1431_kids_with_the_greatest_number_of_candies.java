package ArrayAndString;

import java.util.*;

// https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
public class _1431_kids_with_the_greatest_number_of_candies {

    /**
     * @param candies      有 n 个有糖果的孩子，其中 candies[i] 代表第 i 个孩子拥有的糖果数目
     * @param extraCandies 所有的额外糖果的数量
     * @return 如果把所有的 extraCandies 给第 i 个孩子之后，他会拥有所有孩子中 最多 的糖果
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = 0;
        for (var candy : candies) {
            if (candy > max)
                max = candy;
        }
        var result = new ArrayList<Boolean>();
        for (var candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        var candies = new int[]{2, 3, 5, 1, 3};
        var extraCandies = 3;
        var result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

}
