import java.lang.StringBuilder;

public class SeerializeBinary_37 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }

        public static String Serialize(TreeNode root) {
            if (root == null)
                return "";
            StringBuilder builder = new StringBuilder();
            pre(root, builder);
            return builder.toString();
        }

        private static void pre(TreeNode node, StringBuilder builder) {
            if (node == null) {
                builder.append("#!");
            } else {
                builder.append(node.val + "!");
                pre(node.left, builder);
                pre(node.right, builder);
            }
        }

        static int index = -1;
        public static TreeNode Deserialize(String str) {
            if(str.length() == 0)
                return null;
            String[] strs = str.split(",");
            return Deserialize2(strs);
        }
        static TreeNode Deserialize2(String[] strs) {
            index++;
            if(!strs[index].equals("#")) {
                TreeNode root = new TreeNode(0);
                root.val = Integer.parseInt(strs[index]);
                root.left = Deserialize2(strs);
                root.right = Deserialize2(strs);
                return root;
            }
            return null;
        }

        public static void main(String[] args) {
            TreeNode node1 = new TreeNode(3);
            TreeNode node2= new TreeNode(1);
            TreeNode node3 = new TreeNode(2);
            TreeNode node4= new TreeNode(6);
            TreeNode node5= new TreeNode(8);
            node1.left = node2;
            node1.right = node5;
            node2.right = node3;
            node3.right = node4;
            String string =  Serialize(node1);
            System.out.println(string);
            String str = "3!1!#!2!#!6!#!#!#!";
            TreeNode node = Deserialize(str);
                assert node != null;
                System.out.println(node.val);
            }

    }
}

