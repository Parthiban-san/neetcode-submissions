class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zero_counter = 0;
        boolean all_zero = true;
        for(int num: nums){
            if(num == 0){
                zero_counter += 1;
                continue;
            }else{
                all_zero = false;
            }
            product *= num;
        }

        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(all_zero == true || zero_counter > 1){
                res[i] = 0;
                continue;
            }
            if(zero_counter == 1 && nums[i] != 0){
                res[i] = 0;
            }else if(zero_counter == 1 && nums[i] == 0){
                res[i] = product;
            }else{
                res[i] = product/nums[i];
            }
        }
        return res;
        
    }
}  
