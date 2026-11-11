class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n=s.length(), maxlen=0, left =0;
       HashMap<Character , Integer> map = new HashMap<>();
            for(int i =0;i<n;i++){
                char c=s.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
                while(map.get(c)>1){
                    char cl = s.charAt(left);
                    map.put(cl,map.get(cl)-1);
                    left++;
                }
                maxlen=Math.max(maxlen,i-left+1);
            }
            return maxlen;
    }
}