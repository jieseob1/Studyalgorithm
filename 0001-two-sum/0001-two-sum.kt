class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        
        // 1. for문을 돌면서 map에 키가 있는지 확인하고 없으면 target-value값을 key로 넣어준다. complement
        // 2. 있으면 현재 값과 같이 해서 return 해준다.
        
        for((idx, value) in nums.withIndex()) {
            if(map.containsKey(target - value)) {
                return intArrayOf(map[target-value]!!,idx)
            }
            map.put(value,idx)
        }
        return intArrayOf()
    }
}