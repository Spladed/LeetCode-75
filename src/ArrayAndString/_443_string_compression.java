package ArrayAndString;

public class _443_string_compression {

    // 糟糕的解题......
    public static int compress(char[] chars) {
        var sb = new StringBuilder();
        var currentChar = chars[0];
        var count = 1;
        for (var i = 1; i < chars.length; i++) {
            if (chars[i] == currentChar) {
                count++;
            } else {
                sb.append(currentChar);
                if (count > 1) sb.append(count);
                count = 1;
                currentChar = chars[i];
            }
        }
        sb.append(currentChar);
        if (count > 1) sb.append(count);
        var result = sb.toString();
        var charArray = result.toCharArray();
        for (var i = 0; i < charArray.length; i++) {
            chars[i] = charArray[i];
        }
        return charArray.length;
    }

    public static void main(String[] args) {
        var chars = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        var result = compress(chars);
        System.out.println(result);
        System.out.println(chars);
    }

}
