public class RedQ2 {
    /**
     * Returns which has a higher average value: a given linked list or a given tree.
     *
     * @param head the head of the linked list
     * @param root the root of the tree
     * @return "list" if the list has a bigger average, "tree" otherwise
     */
    public static String biggerAverage(ListNode head, TreeNode root) {
        int listSum = 0;
        int listCount = 0;
        ListNode current = head;

        while (current != null) {
            listSum += current.data;
            listCount++;
            current = current.next;
        }

        double listAverage = (double) listSum / listCount;

        int treeSum = treeSum(root);
        int treeCount = treeCount(root);
        double treeAverage = (double) treeSum / treeCount;

        if (listAverage > treeAverage) {
            return "list";
        }

        return "tree";
    }

    private static int treeSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
)
                + treeCount(root.right);
    }
}