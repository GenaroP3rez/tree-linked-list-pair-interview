public class BlueQ1 {
    /**
     * Given a reference to the root of a tree, return the sum of the leaf nodes with even values in the tree.
     * Do not include any odd or branch nodes.
     * 
     * @param root the root of the tree
     * @return the sum of the even leaf nodes
     */
    public static int evenLeafSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            if (root.data % 2 == 0) {
                return root.data;
            }

            return 0;
        }

        return evenLeafSum(root.left) + evenLeafSum(root.right);
    }
}