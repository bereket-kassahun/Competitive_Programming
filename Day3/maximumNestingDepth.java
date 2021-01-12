class Solution {
    public int maxDepth(String s) {
        int stack = 0;
        int max = 0;
        int length = s.length();
        for(int i = 0; i < length ; i++){
            if(s.charAt(i) == '('){
                stack++;
            }else if(s.charAt(i) == ')'){
                stack--;
            }
            if(stack > max)
                max = stack;
        }
        
        return max;
    }
}