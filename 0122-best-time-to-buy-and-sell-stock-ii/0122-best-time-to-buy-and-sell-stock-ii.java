class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                profit += (nums[i] - nums[i-1]);
            }
        }
        return profit;
    }
}