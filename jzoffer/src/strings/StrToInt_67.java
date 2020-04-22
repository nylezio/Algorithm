package strings;

/**
 * @author: codeJerry
 * @description: 把字符串转换成整数
 * @date: 2020/04/14 13:36
 */
public class StrToInt_67 {

    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        if (chars.length == 0) {return 0;}
        long res = 0;
        int i = 1, sign = 1;
        if (chars[0] == '-'){sign = -1;}
        else if (chars[0] != '+'){i = 0;}
        for(int j = i; j < chars.length; j++) {
            if(chars[j] < '0' || chars[j] > '9') {
                break;
            }
            res = res * 10 + (chars[j] - '0');
            if(res > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return sign * (int)res;

    }
}
