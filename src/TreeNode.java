public class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int n) {
        this.val = n;
    }

    public static TreeNode getInstance() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(6);
        return treeNode;
    }
}
