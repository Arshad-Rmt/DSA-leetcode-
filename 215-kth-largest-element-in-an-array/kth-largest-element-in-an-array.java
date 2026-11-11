class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        if(n==1) return nums[0];
        Arrays.sort(nums);       
        return nums[n-k];

    }
}