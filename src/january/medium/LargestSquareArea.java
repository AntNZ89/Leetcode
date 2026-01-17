package january.medium;

public class LargestSquareArea {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {

        long ans = 0;
        int n = bottomLeft.length;

        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){

                if (topRight[i][0] <= bottomLeft[j][0] || topRight[i][1] <= bottomLeft[j][1]){
                    continue;
                }

                if (topRight[j][0] <= bottomLeft[i][0] || topRight[j][1] <= bottomLeft[i][1]){
                    continue;
                }

                int len = Math.min(Math.abs(Math.min(topRight[i][0], topRight[j][0])-Math.max(bottomLeft[i][0], bottomLeft[j][0])), Math.abs(Math.min(topRight[i][1], topRight[j][1])-Math.max(bottomLeft[i][1], bottomLeft[j][1])));
                ans = Math.max(ans, (long)len*len);

            }
        }

        return ans;

    }
}
