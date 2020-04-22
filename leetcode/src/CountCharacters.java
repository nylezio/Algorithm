/**
 * Author: CHNjerry
 * Date: 2020/03/17 13:04
 */
public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] chars_count = count(chars);
        int res = 0;
        for (String word:words
             ) {
            int[] word_count = count(word);
            if (contains(word_count, chars_count)){
                res+= word.length();
            }
        }
        return res;
    }

    int[] count(String word){
        int[] counter = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            counter[c-'a']++;
        }
        return counter;
    }

    boolean contains(int[] words, int[] chars){
        for (int i = 0; i < 26; i++) {
            if (chars[i] < words[i]) {
                return false;
            }
        }
        return true;
    }
}
