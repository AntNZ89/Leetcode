package febuary.medium;

public class SearchPivot {
    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        return Math.max(search(nums, target, 0, pivot) , search(nums, target, pivot+1, nums.length-1));

    }

    private int findPivot(int[] nums){

        int l = 0;
        int r = nums.length-1;

        while (l < r - 1){
            int m = l + (r-l) / 2;
            if (nums[m] > nums[r]){
                l = m;
            }
            else {
                r = m;
            }
        }

        return l;
    }

    private int search(int[] nums, int target, int l, int r){

        while (l <= r){
            int m = l + (r-l) / 2;
            if (nums[m] == target){
                return m;
            }
            else if (nums[m] > target){
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }

        return -1;

    }
}
