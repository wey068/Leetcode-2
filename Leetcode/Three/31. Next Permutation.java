public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) --i;
        if(i != -1) {
            int j = nums.length-1;
            while(nums[j] <= nums[i]) --j;
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int tmp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = tmp;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}