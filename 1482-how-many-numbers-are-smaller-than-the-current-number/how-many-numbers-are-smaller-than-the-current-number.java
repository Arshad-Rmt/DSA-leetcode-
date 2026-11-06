class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] ans=new int[nums.length];
      for(int i =0;i<nums.length;i++) ans[i]=nums[i];
      Arrays.sort(ans);
        HashMap<Integer,Integer> map = new HashMap<>();
      for(int i =nums.length-1;i>=0;i--){
        map.put(ans[i],i);
      }
      
      for(int i =0;i<nums.length;i++){
        ans[i]=map.get(nums[i]);
      }
        return ans;
    }
   
}