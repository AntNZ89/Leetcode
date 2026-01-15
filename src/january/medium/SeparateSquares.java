package january.medium;

public class SeparateSquares {
    class Solution {
        public double separateSquares(int[][] squares) {

            double total = 0;
            double maxY = 0;
            double minY = Double.POSITIVE_INFINITY;

            for (int[] square : squares){
                double y = square[1];
                double len = square[2];
                maxY = Math.max(maxY, y+len);
                minY = Math.min(minY, y);
                total += len*len;
            }

            double low = minY;
            double high = maxY;
            double line = low + (high-low)/2;
            double precision = Math.pow(10, -5);

            while (low < high){
                if (high-low <= precision){
                    break;
                }

                double topArea = calcTop(squares, line);
                double botArea = total-topArea;

                if (topArea > botArea){
                    low = line;
                }
                else {
                    high = line;
                }

                line = low + (high-low)/2;

            }

            return low;

        }

        private static double calcTop(int[][] squares, double line){
            double area = 0;

            for (int[] square : squares){
                double y = square[1];
                double width = square[2];

                if (y >= line){
                    area += width*width;
                }
                else if (y+width >= line){
                    double height = y+width-line;
                    area += height*width;
                }

            }

            return area;
        }

    }
}
