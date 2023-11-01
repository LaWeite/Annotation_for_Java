import java.util.HashMap;
import java.util.Map;

class Solution {
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private Map<Integer, Integer> freq= new HashMap();
    private int maxCount = 0;

    private void initializeMap(TreeNode root) {
        if (root == null) {
            return;
        }

        int value = freq.getOrDefault(root.val, 0);
        ++value;
        freq.put(root.val, value);

        if (root.left != null) {
            initializeMap(root.left);
        }

        if (root.right != null) {
            initializeMap(root.right);
        }
    }

    public int[] findMode(TreeNode root) {
        initializeMap(root);
        for (Integer element : freq.values()) {
            if (element > maxCount) {
                maxCount = element;
            }
        }

        int[] result = new int[100];
        int index = 0;
        for (Integer key : freq.keySet()) {
            if (freq.get(key) == maxCount) {
                result[index++] = key;
            }
        }

        int[] data = new int[index];
        System.arraycopy(result, 0, data, 0, index);

        return data;
    }
}
