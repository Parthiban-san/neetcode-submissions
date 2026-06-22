class Solution {
    public int longestConsecutive(int[] nums) {
        var numSet = new HashSet<Integer>();
        int count = 1;
        if(nums.length == 0){
            return 0;
        }
        for(int num: nums){
            numSet.add(num);
        }
        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int c = 1;
                while(numSet.contains(num+1)){
                    c++;
                    num++;
                    if(c > count){
                        count = c;
                    }
                }
            }
        }
        return count;
    }
}
