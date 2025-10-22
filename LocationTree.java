class TreeNode{
    String data;
    TreeNode left, right;

    public TreeNode(String data) {
        this.data = data;
        left = right = null;
    }
}

public class LocationTree {
    private TreeNode root;

    public void insert(String data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, String data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (data.compareTo(root.data) < 0)
            root.left = insertRec(root.left, data);
        else if (data.compareTo(root.data) > 0)
            root.right = insertRec(root.right, data);
        return root;
    }

    public void inorder() {
        System.out.println("\n --- Location (Tree Traversal Order) --");
        inorderRec(root);
        System.out.println();

    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}