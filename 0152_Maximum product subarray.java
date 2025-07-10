class Solution {
    public int maxProduct(int[] nums) {
        int f = nums[0], g = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int ff = f, gg = g;
            f = Math.max(nums[i], Math.max(ff * nums[i], gg * nums[i]));
            g = Math.min(nums[i], Math.min(ff * nums[i], gg * nums[i]));
            ans = Math.max(ans, f);
        }
        return ans;
    }
}

********************************************************************

class Solution {

    public int maxProduct(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);
            max = Math.max(max, currentMax);
        }

        return max;
    }
}
