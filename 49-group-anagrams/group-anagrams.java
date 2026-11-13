class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String x:strs){
            char[] c=x.toCharArray();
            Arrays.sort(c);

            String k=String.valueOf(c);
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(x);
        }
        
        return new ArrayList<>(map.values());
    }
}