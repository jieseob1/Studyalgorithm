class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        //new interval의 start, end을 꺼내서
        List<Interval> list = new ArrayList();
        
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        for( int i = 0 ; i < intervals.length;i++) {
            int[] interval = intervals[i];
            //2가지 조건 newinterval의 시작점이 interval 사이에 있을 때,
            // end
            if(interval[1] < newInterval[0]) { // 새로운 인터벌보다 interval[0]이 작은 경우
                list.add(new Interval(interval[0],interval[1]));
            }
            //3
            
            else if(interval[0] > newInterval[1]) {
                list.add(new Interval(interval[0],interval[1]));
            }
            else {
                newStart = Math.min(newStart, interval[0]);
                newEnd = Math.max(newEnd, interval[1]);
            }
        }
        list.add(new Interval(newStart, newEnd));
        Collections.sort(list, (a,b) -> a.start - b.start);
        int[][] answer = new int[list.size()][2];
        for(int i = 0 ; i < list.size();i++) {
            answer[i][0] = list.get(i).start;
            answer[i][1] = list.get(i).end;
        }
        return answer;
    }
}
class Interval {
    int start;
    int end;
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

}