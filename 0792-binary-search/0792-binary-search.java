class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1; //final idx
        
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) { // 4 2 
                // mid idx의 값이 target보다 크다면 
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}