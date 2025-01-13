package ArrayAndString;

public class _345_reverse_vowels_of_a_string {

    public static final boolean[] VOWELS = new boolean[128];

    static {
        for (var c : "aeiouAEIOU".toCharArray()) {
            VOWELS[c] = true;  // 在元音的位置上塞true
        }
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        var i = 0;
        var j = s.length() - 1;
        while (i <= j) {
            while (i < j && !VOWELS[chars[i]]) {
                i++;
            }
            while (i < j && !VOWELS[chars[j]]) {
                j--;
            }
            var temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        var s = "IceCreAm";
        var result = reverseVowels(s);
        System.out.println(result);
    }

}
