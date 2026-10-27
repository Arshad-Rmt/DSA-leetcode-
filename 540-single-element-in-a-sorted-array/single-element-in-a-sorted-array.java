class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        if(n==1) return nums[0];
       int l=0;
       int r=n-1;
       while(l<r){
        int mid = l+(r-l)/2;
        if(mid%2!=0){
            mid--;
        }
           if(nums[mid] == nums[mid+1]){
                l=mid+2;
            }else{
                r=mid;
            }
         ans = nums[l];
       }
        return ans;
        
    }
}