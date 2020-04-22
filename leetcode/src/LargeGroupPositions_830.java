import java.util.ArrayList;
import java.util.List;

/**
 * @author: CHNjerry
 * @date: 2020/03/22 20:10
 */
public class LargeGroupPositions_830 {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans =  new ArrayList<>();
        if (S.length() == 0 || S.length() == 1) {return ans;}
        int left = 0;
        int right = 1;
        int currLength = 0;
        char l = S.charAt(left);
        while (right < S.length()){
            char r = S.charAt(right);
            if (r==l) {
                currLength++;
            } else {
                if (currLength >= 2){
                    List<Integer> list = new ArrayList<>();
                    list.add(left);
                    list.add(right - 1);
                    ans.add(list);
                }
                currLength = 0;
                left = right;
                l = r;
            }
            right++;
        }
        if (currLength >= 2) {
            List<Integer> list = new ArrayList<>();
            list.add(left);
            list.add(right - 1);
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = new String("abcdddeeeeaabbbcddd");
        List<List<Integer>> ans =  largeGroupPositions(S);
        for (List list: ans){
            System.out.println(list);
        }
        System.out.println(ans.hashCode());
    }
    
}
