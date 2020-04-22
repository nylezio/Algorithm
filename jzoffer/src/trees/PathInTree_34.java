package trees;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * */
public class PathInTree_34 {

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (root == null) {return arrayLists;}
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        search(root, target, arrayLists, ans, sum);
        return arrayLists;
    }

    public static void search(TreeNode root, int target, ArrayList<ArrayList<Integer>> arrayLists, ArrayList<Integer> ans, int sum){
        if (root == null) {return;}
        sum += root.val;
        if (root.left == null && root.right == null){
            if (sum == target){
                ans.add(root.val);
                arrayLists.add(new ArrayList<Integer>(ans));
                ans.remove(ans.size() - 1);
            }
            return;
        }
        ans.add(root.val);
        search(root.left, target, arrayLists, ans, sum);
        search(root.right, target, arrayLists, ans, sum);
        ans.remove(ans.size() - 1);
    }

}
