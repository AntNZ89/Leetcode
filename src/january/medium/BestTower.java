package january.medium;

public class BestTower {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int px = center[0];
        int py = center[1];
        int qMax = -1;

        for (int[] tower : towers){
            int x = tower[0];
            int y = tower[1];
            int q = tower[2];
            int dist = Math.abs(x-px) + Math.abs(y-py);

            if (dist > radius){
                continue;
            }

            if (qMax < q){
                ans[0] = x;
                ans[1] = y;
                qMax = q;
            }
            else if (qMax == q){
                if (x < ans[0] || (x == ans[0] && y < ans[1])){
                    ans[0] = x;
                    ans[1] = y;
                }
            }

        }

        return ans;

    }
}
