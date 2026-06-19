class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var freqMap = new HashMap<Integer, Integer>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        List<Integer> res = freqMap.entrySet().stream().sorted((a,b)->Long.compare(b.getValue(),a.getValue())).limit(k).map(e->e.getKey()).collect(Collectors.toList());
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
