class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var freqMap = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sorted_str = new String(s);
            if(freqMap.containsKey(sorted_str)){
                freqMap.get(sorted_str).add(str);
            }else{
                var list = new ArrayList<>(List.of(str));
                freqMap.put(sorted_str, list);
            }
        }
        
        return freqMap.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
    }
}
