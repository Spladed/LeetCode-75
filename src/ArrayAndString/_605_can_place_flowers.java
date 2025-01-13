package ArrayAndString;

import java.util.ArrayList;

public class _605_can_place_flowers {

    /**
     * @param flowerbed flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花
     * @param n         否在不打破种植规则的情况下种入 n 朵花（花不能种植在相邻的地块上）
     * @return 能则返回 true ，不能则返回 false
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true; // 不需要种花，直接返回
        var count = 0;
        var length = flowerbed.length;
        for (var i = 0; i < length; i++) {
            if (flowerbed[i] == 0 // 当前位置可以种花
                    && (i == 0 || flowerbed[i - 1] == 0) // 当前是最左边，或左边是空的
                    && (i == length - 1 || flowerbed[i + 1] == 0)) { // 当前是最右边，或右边是空的
                flowerbed[i] = 1; // 给当前位置种花
                count++; // 计数器+1
                i++; // 跳过下一个位置，从下下个位置开始
            }
            if (count >= n) return true;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        var flowerbed = new int[]{0, 0, 1, 0, 0};
        var n = 1;
        var result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }

}
