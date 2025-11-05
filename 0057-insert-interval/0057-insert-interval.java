class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList();
        boolean inserted = false;
        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        for(int[] interval: intervals) {
            int start = interval[0];
            int end = interval[1];
            //3단계로 나눠야됨 
            //1. 기존 internval이 newInterval보다 왼쪽
            if(newStart > end) {
                result.add(interval);
            } else if (newEnd < start) {
                //2. 기존 internval이 newInterval보다 오른쪽에 있을때
                if(!inserted) { // 이 부분 이렇게 한 이유 => inserted는 왜 이렇게 하지
                    result.add(new int[]{newStart, newEnd});
                    inserted = true;
                }
                result.add(interval);
            } else {
                //2. 중간에 있어서 병합해야 되는 경우
                newStart = Math.min(newStart, start);
                newEnd = Math.max(newEnd, end);
            }
        }
        if(!inserted) {
            result.add(new int[]{newStart, newEnd});
        }
        return result.toArray(new int[result.size()][]); // toArray가 가능한거 같은데, 이유와 뒤에 new int부분
    }
}