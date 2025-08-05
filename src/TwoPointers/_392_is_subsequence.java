package TwoPointers;

public class _392_is_subsequence {

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; i < s.length() && j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        var s = "axc";
        var t = "ahbgdc";
        var result = isSubsequence(s, t);
        System.out.println(result);
    }

}
