class Solution {
    public boolean containsDuplicate(int[] nums) {
    //  List<Integer> ans = Arrays.stream(nums)
    //       .distinct()
    //       .boxed()
    //       .toList();

    //       if(nums.length== ans.size()) return false;

    //       return true;  

    return Arrays.stream(nums)
             .distinct()
             .count() != nums.length;
    }
}