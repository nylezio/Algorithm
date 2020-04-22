package strings;

/**
 * @author: codeJerry
 * @description: 翻转单词顺序
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 *
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * @date: 2020/04/13 20:05
 */
public class ReverseWords_58_01 {

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0 ; i--) {
            if ("".equals(strings[i])) {continue;}
            sb.append(strings[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String string = "the sky is blue";
        String str = reverseWords(string);
        System.out.println(str);
    }
}
