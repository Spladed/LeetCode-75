package ArrayAndString;

// https://leetcode.cn/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class _1768_merge_strings_alternately {

    public static String mergeAlternately(String word1, String word2) {
        var minLen = Math.min(word1.length(), word2.length());
        var sb = new StringBuilder();
        for (var i = 0; i < minLen; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(word1.substring(minLen));
        sb.append(word2.substring(minLen));
        return sb.toString();
    }

    public static void main(String[] args) {
        var word1 = "abcd";
        var word2 = "pq";
        var result = mergeAlternately(word1, word2);
        System.out.println(result);
    }

}
