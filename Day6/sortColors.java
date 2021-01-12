class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int left = 0;
        int mid  = 0;
        int right = nums.length - 1;
        
        while (mid <= right) {
            System.out.println(Arrays.toString(nums));
            if (nums[mid] == 0) {
                swap(nums, mid++, left++);
                
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, right--);
            }
        }
    }
    
    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}