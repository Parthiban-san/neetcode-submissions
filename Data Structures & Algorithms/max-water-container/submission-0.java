class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        for(int i=0; i<heights.length - 1; i++){
            int left = i;
            int right = i+1;
            while(right < heights.length){
                int gap = right - left;
                int area = gap * Math.min(heights[left], heights[right]);
                res = Math.max(res, area);
                right++;
            }
        }

        return res;
        
    }
}
