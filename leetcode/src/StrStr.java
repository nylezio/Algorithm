/**
 * @author: codeJerry
 * @description: 找字符
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date: 2020/04/03 12:39
 */
public class StrStr {

    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();
        if (needLength == 0){return 0;}
        if (hayLength == 0){return -1;}
        if (hayLength < needLength){return -1;}
        for (int i = 0; i<= hayLength - needLength;i++){
//            int currLength = 0;
            for (int j = 0; j < needLength; j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
                if (j == needLength -1){
                    return i;
                }

            }
        }
        return -1;
    }
    public int strStr1(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();

        for (int start = 0; start < n - L + 1; ++start) {
            if (haystack.substring(start, start + L).equals(needle)) {
                return start;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr1("hello", "ll"));
    }
}
