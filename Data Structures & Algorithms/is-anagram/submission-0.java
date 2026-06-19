class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Boolean res = false;
        if(s1.length == t1.length){
            Arrays.sort(s1);
            Arrays.sort(t1);
            for(int i=0; i<s1.length; i++){
                if(s1[i] == t1[i]){
                    res = true;
                }else{
                    res = false;
                    break;
                }
            }
        }
        return res;
    }
}
