public class BlueQ2 {
    /**
     * Returns which has a higher range: a given linked list or a given tree.
     * The range of a data structure is the difference between its highest
     * value and its lowest value.
     * 
     * Returns "list" if the list has a higher range and "tree" if the tree has
     * a higher range. You can assume there will not be a tie, and neither head
     * nor root will be null.
     * 
     * @param head the head of the list
     * @param root the root of the tree
     * @return "list" if the list has a bigger range, "tree" otherwise
     */
    public static String biggerRange(ListNode head, TreeNode root) {
        int listMin = head.data;
        int listMax = head.data;

        ListNode current = head;

        while (current != null) {
            if (current.data < listMin) {
                listMin = current.data;
            }

            if (current.data > listMax) {
                listMax = current.data;
            }

            current = current.next;
        }

        int listRange = listMax - listMin;

        int treeMin = treeMinimum(root);
        int treeMax = treeMaximum(root);
        int treeRange = treeMax - treeMin;

        if (listRange > treeRange) {
            return "list";
        }

        return "tree";
    }

    private static int treeMinimum(TreeNode root) {
        int minimum = root.data;

        if (root.left != null) {
            minimum = Math.min(minimum, treeMinimum(root.left));
        }

        if (root.right != null) {
            minimum = Math.min(minimum, treeMinimum(root.right));
        }

        return minimum;
    }

    private static int treeMaximum(TreeNode root) {
        int maximum = root.data;

        if (root.left != null) {
            maximum = Math.max(maximum, treeMaximum(root.left));
        }

        if (root.right != null) {
            maximum = Math.max(maximum, treeMaximum(root.right));
        }

        return maximum;
    }
}