class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap();

       for(int num : nums) {
        map.put(num, map.getOrDefault(num,0) + 1);
       }
       int maxKey = 0;
       int maxValue = 0;
       for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
       }
       return maxKey;
    }
}