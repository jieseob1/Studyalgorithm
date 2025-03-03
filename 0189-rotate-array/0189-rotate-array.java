class Solution {
    public void rotate(int[] nums, int k) {
        //정수 배열 nums가 주어지면, 배열을 k 단계만큼 오른쪽으로 회전합니다. 여기서 k는 음수가 아닙니다.
        //O(n)만큼 끝내야 된다.
        //방법 iterate를 하면서 length-1를 가지고 이고 (length-1+k) / 7만큼해서 새로운 배열을 만들어준다.
        int[] newArr = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++) {
            int idx = (i + k) % (nums.length); //0부터 6까지
            newArr[idx] = nums[i];
        }
        for(int i = 0; i < nums.length;i++) {
            nums[i] = newArr[i];
        }
    }
}