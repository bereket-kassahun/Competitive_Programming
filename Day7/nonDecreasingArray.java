class Solution {
    public boolean checkPossibility(int[] nums) {
        int length = nums.length-1;
        boolean firstTime = false;
        for(int i = 0; i < length; i++){
            if(nums[i] <= nums[i+1])
                continue;
            else{
                if(firstTime || (i > 0 && nums[i+1] < nums[i-1])){
//                     System.out.println(i+1+ " "+ (i-1));
                    return false;
                }
                firstTime = true;
            }
        }
        return true;
    }
}
