class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
     for(int i=1;i<nums.length;i++){
        if(nums[i-1] >= nums[i]){
            int x=nums[i-1]-nums[i]+1;
            ans=ans+x;
            nums[i]+=x;
        }
        
     }
     return ans;        
    }
}