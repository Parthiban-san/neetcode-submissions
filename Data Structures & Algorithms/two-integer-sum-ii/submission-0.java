class Solution {
    public int[] twoSum(int[] numbers, int target) {
        var seen = new HashMap<Integer, Integer>();
        for(int i=0; i<numbers.length; i++){
            int balance = target - numbers[i];
            if(seen.containsKey(balance)){
                return new int[]{seen.get(balance)+1, i+1};
            }
            seen.put(numbers[i], i);
        }
        return null;
    }
}
