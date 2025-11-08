class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 배열, 투포인터, sorting
        // 이거 풀었던 문제
        //1. sorting
        Arrays.sort(nums); // nums에 0만 수없이 많은 케이스 해결 
        // make 0
        Set<List<Integer>> list = new HashSet(new ArrayList());
        for(int i = 0; i < nums.length -2; i++) {
            int firstVal = nums[i];
            int leftVal = i+1;
            int rightVal = nums.length -1; // left,right 
            while(leftVal < rightVal) {
                int sum = firstVal + nums[leftVal] + nums[rightVal];
                if(sum >= 0) {
                    if(sum == 0) {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(firstVal);
                        subList.add(nums[leftVal]);
                        subList.add(nums[rightVal]);
                        list.add(subList);
                    }
                    rightVal--;
                } else {
                    //마이너스이니까 left를 올림
                    leftVal++;
                }
            }
            
            // 여기서 List에서의 set으로 만들어서 중복을 없애는 방법은? 

        }
        return list.stream().collect(Collectors.toList());
    }
}