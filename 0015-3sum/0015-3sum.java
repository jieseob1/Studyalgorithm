class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 모든 triplets 이 0인거
        // 따로 정렬 안하고, n번 돌면서 투포인터 써서 값 추가하기
        List<List<Integer>> list = new ArrayList();
        List<Integer> subList = new ArrayList(); //list distinct
        // 1.오름차순 정렬
        Arrays.sort(nums);
        int len = nums.length;
        //2. for문으로 처리하고, left ,right 만들어서 3중 포인트 만들기
        for(int i = 0; i < len-2;i++) {
            int left = i+1;
            int right = len-1;
            int firstPtr = nums[i];
            if (i > 0 && firstPtr == nums[i - 1]) continue;
                if(firstPtr > 0) {
                    break;
                }
            while(left < right) {
                
                int secondPtr = nums[left];
                int thirdPtr = nums[right];
                if(firstPtr + secondPtr + thirdPtr <= 0) {
                    if(firstPtr + secondPtr + thirdPtr == 0) {
                        subList.add(firstPtr);
                        subList.add(secondPtr);
                        subList.add(thirdPtr);
                        list.add(subList);
                        subList = new ArrayList();
                    }
                    left++;
                } else {
                    right--;
                }
            }
            
            
        }
        return list.stream().distinct().collect(Collectors.toList());
    }
}