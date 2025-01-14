package ArrayAndString;

import java.util.Arrays;
import java.util.Collections;

public class _151_reverse_words_in_a_string {

    public static String reverseWords(String s) {
        var list = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public static void main(String[] args) {
        var s = "the sky is blue";
        var result = reverseWords(s);
        System.out.println(result);
    }

}
