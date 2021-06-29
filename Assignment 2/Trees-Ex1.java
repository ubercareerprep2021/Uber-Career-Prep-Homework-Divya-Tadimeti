/* Printing option 2, inorder traversal of the tree. */

class Solution {
  
  /* Helper function to perform the recursive traversal of the tree.
  First the left branch, then the root, then the right branch. */
  public void helper(TreeNode root, List<Integer> list) {
    if (root != null) {
      if (root.left != null) {
        helper(root.left, list);
      }

      list.add(root.data);

      if (root.right != null) {
        helper(root.right, list);
      }
    }
  }

  public int print(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    helper(root, list);
    System.out.println(list);
  }
}
