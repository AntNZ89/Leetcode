package january.medium;

public class LcaDeepestLeaves {
//    public TreeNode lcaDeepestLeaves(TreeNode root) {
//
//        if (root == null){
//            return root;
//        }
//
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
//        parent.put(root, null);
//        List<TreeNode> last = new ArrayList<>();
//
//        while (q.size() != 0){
//            int size = q.size();
//            last.clear();
//
//            for (int i = 0 ; i < size ; i++){
//                TreeNode temp = q.poll();
//                last.add(temp);
//
//                if (temp.left != null){
//                    q.offer(temp.left);
//                    parent.put(temp.left, temp);
//                }
//                if (temp.right != null){
//                    q.offer(temp.right);
//                    parent.put(temp.right, temp);
//                }
//            }
//        }
//
//        HashSet<TreeNode> set = new HashSet<>(last);
//
//        while (set.size() > 1){
//            HashSet<TreeNode> temp = new HashSet<>();
//            for (TreeNode node : set){
//                temp.add(parent.get(node));
//            }
//            set = temp;
//        }
//
//        return set.iterator().next();
//
//    }
}
