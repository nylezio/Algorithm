package trees;

/**
 * @author: codeJerry
 * @description:
 * @date: 2020/06/04 00:31
 */
public class HasPathSum_112 {
    static boolean equals;
    static int target;
    public static boolean hasPathSum(TreeNode root, int sum) {
        equals = false;
        target = sum;
        getAdd(root, 0);
        return equals;
    }

    public static void getAdd(TreeNode node, int val){
        if (node == null) {return;}
        int curVal = val + node.val;
        if (node.left == null && node.right == null && curVal == target){
            equals = true;
        }
        getAdd(node.left, curVal);
        getAdd(node.right, curVal);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(8);
        boolean b = hasPathSum(node, 13);
        System.out.println(b);
    }
}
