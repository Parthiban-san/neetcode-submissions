class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str: strs){
            int len = str.length();
            res += (len+"#"+str);
        }
        System.out.println(res);
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        String curr_length = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                curr_length += str.charAt(i);
            }else{
                int len = Integer.parseInt(curr_length);
                curr_length = "";
                // i = i+len;
                res.add(str.substring(i+1, i+len+1));
                i = i+len;
            }
        }
        System.out.println(res);
        return res;
    }
}
