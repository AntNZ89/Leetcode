package january.medium;

public class MaxLevelSum {
//    public int maxLevelSum(TreeNode root) {
//
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        int ans = 1;
//        int max = root.val;
//        int c = 1;
//
//        while (q.size() != 0){
//
//            int size = q.size();
//            int sum = 0;
//
//            for (int i = 0 ; i < size ; i++){
//                TreeNode temp = q.poll();
//                sum += temp.val;
//
//                if (temp.left != null){
//                    q.offer(temp.left);
//                }
//                if (temp.right != null){
//                    q.offer(temp.right);
//                }
//            }
//
//            if (sum > max){
//                ans = c;
//                max = sum;
//            }
//
//            c++;
//
//        }
//
//        return ans;
//
//    }
}
