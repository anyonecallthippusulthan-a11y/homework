class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

 class PreorderTree {

    // Preorder: Root → Left → Right
    static void preorder(TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // Create tree manually
        TreeNode root = new TreeNode(8);

        root.left = new TreeNode(4);
        root.right = new TreeNode(12);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        // Preorder Traversal
        System.out.print("Preorder: ");
        preorder(root);
    }
}