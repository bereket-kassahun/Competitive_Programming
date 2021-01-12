class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[100];
        int[] nSum = new int[100];
        nSum[0] = 0;
        nSum[1] = 0;
        nSum[2] = 1;
        for(int i = 3; i < 100; i++){
            nSum[i] = nSum[i-1] + i-1;
        }
        int ret = 0;
        
        for(int i : nums){
            count[i-1] += 1; 
        }
        for(int i: count){
            if(i != 0)
                ret += nSum[i];
        }
        return ret;
    }
}