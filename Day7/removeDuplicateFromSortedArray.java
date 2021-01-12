class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length < 2)
            return length;
        int left = 1;
        int right = 1;
        for(int i = 1; i < length; i++){
            if(nums[i-1] == nums[i]){
                right++;
                continue;
            }
            if(left != right){
                nums[left] = nums[right];
            }
            left++;
            right++;
        }
        return left;
    }
}