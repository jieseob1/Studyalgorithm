class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 정수 배열 nums가 주어졌을 때, 배열에 값이 두 번 이상 나타나면 true를 반환하고, 모든 요소가 다르면 false를 반환합니다.
        boolean flag = false;
        Map<Integer,Integer> map = new HashMap();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            if(map.getOrDefault(num,0) > 1) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}