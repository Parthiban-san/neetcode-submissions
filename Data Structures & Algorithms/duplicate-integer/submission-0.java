class Solution {
    public boolean hasDuplicate(int[] nums) {
        var dupMap = new HashMap<Integer, Integer>();
        Boolean result = false;
        for(int num: nums){
            dupMap.put(num, dupMap.getOrDefault(num, 0)+1);
            if(dupMap.get(num)>1){
                result = true;
                break;
            }
        }
        return result;
    }
}