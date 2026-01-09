package january.medium;

public class MaxSumDivThree {
    public int maxSumDivThree(int[] nums) {

        int div11 = Integer.MAX_VALUE;
        int div12 = Integer.MAX_VALUE;
        int div21 = Integer.MAX_VALUE;
        int div22 = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums){
            sum += num;
            if (num %  3 == 1 && num < div11){
                div12 = div11;
                div11 = num;
            }
            else if (num % 3 == 1 && num < div12){
                div12 = num;
            }
            else if (num % 3 == 2 && num < div21){
                div22 = div21;
                div21 = num;
            }
            else if (num % 3 == 2 && num < div22){
                div22 = num;
            }
        }

        if (sum % 3 == 0){
            return sum;
        }

        if (sum % 3 == 1){
            if (div11 == Integer.MAX_VALUE){
                return sum - div21 - div22;
            }
            else if (div21 == Integer.MAX_VALUE || div22 == Integer.MAX_VALUE){
                return sum - div11;
            }
            else {
                if (div11 > (div21+div22)){
                    return sum - div21 - div22;
                }
                else {
                    return sum - div11;
                }
            }
        }

        if (div21 == Integer.MAX_VALUE){
            return sum - div11 - div12;
        }
        else if (div11 == Integer.MAX_VALUE || div12 == Integer.MAX_VALUE){
            return sum - div21;
        }
        else {
            if (div21 > (div11+div12)){
                return sum - div11 - div12;
            }
            else {
                return sum - div21;
            }
        }

    }
}
