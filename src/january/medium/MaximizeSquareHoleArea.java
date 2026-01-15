package january.medium;

import java.util.Arrays;

public class MaximizeSquareHoleArea {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {

        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int h = 2;
        int temp = 2;

        for (int i = 1 ; i < hBars.length ; i++){
            if (hBars[i]-1 == hBars[i-1] ){
                temp++;
            }
            else {
                temp = 2;
            }
            h = Math.max(h, temp);
        }

        int v = 2;
        temp = 2;

        for (int i = 1 ; i < vBars.length ; i++){
            if (vBars[i]-1 == vBars[i-1]){
                temp++;
            }
            else {
                temp = 2;
            }
            v = Math.max(v, temp);
        }

        return Math.min(h, v) * Math.min(h, v);

    }
}
