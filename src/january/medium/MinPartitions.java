package january.medium;


public class MinPartitions {
    public int minPartitions(String n) {

        int max = 0;

        for (char ch : n.toCharArray()){
            max = Math.max(max, (ch-'1'+1));
            if (max == 9) return 9;
        }

        return max;

    }
}
