package strings;

/**
 * @author: codeJerry
 * @description: 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * @date: 2020/04/14 17:30
 */
public class ReplaceSpace_05 {
    public String replaceSpace(String s) {
        if (s == null){return null;}
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }
}
