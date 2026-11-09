class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag=true;
        if(s.length() != t.length()) return false;
        // HashSet<Character> set = new HashSet<>();
        // for(char c:s.toCharArray()){
        //     set.add(c);
        // } 

        // for(char x : t.toCharArray()){
        //     if(!set.contains(x)) flag = false ;
        // }

        HashMap<Character , Integer> maps = new HashMap<>();
        HashMap<Character , Integer> mapt = new HashMap<>();
        for(int i=0;i< s.length();i++){
            maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1);
            mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1);
        }
      
        // for(char c:maps.keySet()){
        //     if(maps.getOrDefault(c,0) != mapt.getOrDefault(c,0)) return false;
        // }

        return maps.equals(mapt);
    }
}