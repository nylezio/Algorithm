package slidingwindows;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: codeJerry
 * @description: 最长不含重复字符的子字符串
 * @date: 2020/04/13 19:17
 */
public class LengthOfLongestSubstring_48 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {return 0;}
        if (s.length() == 1) {return 1;}
        int left = 0;
        int right = 0;
        int max = 1;
        while (right < s.length() - 1){
            right++;
            if (s.substring(left,right).indexOf(s.charAt(right)) == -1){
                max = Math.max(max,right - left + 1);
            } else {
                while (s.substring(left,right).indexOf(s.charAt(right)) != -1){
                    left = Math.max(left + 1,s.substring(left,right).indexOf(s.charAt(right)) + 1);
                }
            }
        }
        return max;

    }

    /**
     * 运用了HashMap保存
     * @param s 字符串
     * @return 最长无重复值长度
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        /*key出现的字符，value对应的最新的位置*/
        Map<Character, Integer> map = new HashMap<>();
        // try to extend the range [i, j]
        for (int end = 0, start = 0; end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                //由于重复的坐标不知道在start的前方还是后方，所以要取个最大值
                start = Math.max(map.get(s.charAt(end)) + 1, start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end);
        }
        return ans;
    }

}
