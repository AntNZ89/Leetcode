package febuary.medium;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int l = 0;
        int r = nums.length;
        if (nums.length == 1) return 0;

        while (l <= r){
            int m = l + (r-l) / 2;

            if (m-1 == -1  && nums[m] > nums[m+1]){
                return m;
            }

            if (m+1 == nums.length && nums[m] > nums[m-1]){
                return m;
            }

            if (nums[m-1] < nums[m] && nums[m+1] < nums[m]){
                return m;
            }
            else if (nums[m-1] > nums[m]){
                r = m;
            }
            else {
                l = m;
            }
        }

        return 67;

    }

}
