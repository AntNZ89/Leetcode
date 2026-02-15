package febuary.medium;

public class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] ans = new double[query_row+1][query_row+1];
        ans[0][0] = poured;

        for (int r = 0 ; r < query_row ; r++){
            for (int c = 0 ; c <= r ; c++){
                double pour = (ans[r][c] - 1) / 2;
                if (pour > 0){
                    ans[r+1][c] += pour;
                    ans[r+1][c+1] += pour;
                }
            }
        }

        return Math.min(1, ans[query_row][query_glass]);

    }
}
