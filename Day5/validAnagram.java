class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Set<Character> set = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        for(char c: s.toCharArray()){
            set.add(c);
            sum1 += c;
        }
            
        for(char c: t.toCharArray()){
            if(!set.contains(c))
                return false;
            sum2 += c;
        }
        
        return sum1 == sum2;
    }
}