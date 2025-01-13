package ArrayAndString;

import java.util.Map;

// https://leetcode.cn/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
public class _1071_greatest_common_divisor_of_strings {

    public static String gcdOfStrings(String str1, String str2) {
        var compare = str1.length() > str2.length() ? new String[]{str1, str2} : new String[]{str2, str1};
        var longer = compare[0];
        var shorter = compare[1];
        for (var length = shorter.length(); length > 0; length--) {
            var prefix = shorter.substring(0, length);
            if (compare(prefix, str1) && compare(prefix, str2)) {
                return prefix;
            }
        }
        return "";
    }

    private static boolean compare(String prefix, String string) {
        if (string.length() % prefix.length() != 0) {
            return false;
        }
        var repeatCount = string.length() / prefix.length();
        return string.equals(prefix.repeat(repeatCount));
    }

    public static void main(String[] args) {
        var str1 = "ABABAB";
        var str2 = "ABAB";
        var result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }

}
