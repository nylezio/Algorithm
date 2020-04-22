package trees;

import java.util.Stack;

public class MirrorOfBinaryTree_27 {


    private static TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return null;
        }

        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;

    }

    private static TreeNode mirrorTree1(TreeNode root) {
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left != null){stack.add(node.left);}
            if (node.right != null){stack.add(node.right);}
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(5);
        root.left = root1;
        root.right = root2;
        root1.left = root3;
        TreeNode treeNode = mirrorTree1(root);
        System.out.println(treeNode.val);
    }
}
