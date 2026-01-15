package january.medium;

public class MinTimeToVisitAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) {

        int n = points.length;
        int ans = 0;
        int prevX = points[0][0];
        int prevY = points[0][1];

        for (int i = 1 ; i < n ; i++){
            int x = points[i][0];
            int y = points[i][1];

            int dX = Math.abs(x-prevX);
            int dY = Math.abs(y-prevY);

            ans += Math.max(dX, dY);

            prevX = x;
            prevY = y;
        }

        return ans;

    }
}
