class Solution {
    public void moveZeroes(int[] nums) {
        //모든 0을 
        //right 포인터가 0인 경우는 뭘 하지 않고 넘어가고
        //left포인터가 0이면 ~~
        // 둘다 00이면 ~~
        /**
        여기서 두 포인터 접근 방식이 도움이 될 수 있습니다. 
        아이디어는 배열을 반복하기 위한 포인터 하나와 배열의 0이 아닌 요소에만 작동하는 
        포인터 하나를 갖는 것입니다.
         */
        int left = 0;
        int right = 1;
        if(nums.length == 1) return;
        while(right <= nums.length-1) {
         
            if(nums[left] != 0) {
                left++;
            } 
            if(nums[right] != 0 && nums[left] == 0) {
                System.out.println("left => " + left + " right => " + right + " nums[left] => " + nums[left] + " nums[right] => " + nums[right]);
                swap(nums, left,right);
            }
            right++;
        }
    }

    private void swap(int[] arr, int left, int right) {
            int temp = arr[right]; //오른쪽꺼를 꺼내서
            arr[right] =arr[left];
            arr[left] = temp;
        }
}