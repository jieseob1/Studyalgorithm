import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        //찾아보니까 특정 element를 remove 할수 있는 기능이 있다. => 따라서 해당 기능 써서 하면 따로 특정 어레이를 두고 사용하지 않아도 된다.
        //i 숫자 => 큐에 삽입
        // D 1는 최댓값 삭제
        // D -1은 최솟값 삭제
        //여기서는 따로 이중 우선순위 큐를 제외하고, 하나의 기준 map같은걸 둬서 이를 해결하도록 한다.
        //따로 리스트 둬서 삭제 이력 관리하도록 해야 함
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b -a);
        int size = 0;
        for(String operation : operations) {
            String[] splitOperation = operation.split(" ");
            String command = splitOperation[0];
            int number = Integer.parseInt(splitOperation[1]);
            if (command.equals("I")){ //삽입 케이스
                minHeap.add(number);
                maxHeap.add(number);
                size++;
            } else { //삭제 케이스 
                if(number < 0) {
                    if(size == 0) continue;
                    int minNum = minHeap.poll();
                    maxHeap.remove(minNum);
                    if(--size == 0) {
                        minHeap.clear();
                        maxHeap.clear();
                    }
                } else {
                    if(size == 0) continue;
                    int maxNum = maxHeap.poll();
                    minHeap.remove(maxNum);
                    if(--size == 0) {
                        minHeap.clear();
                        maxHeap.clear();
                    }
                }
            }
        }
        if(size ==0) {
            return new int[] {0,0};
        } else {
            int max = maxHeap.peek();
            int min = minHeap.peek();
            return new int[] {max,min};
        }
    }
}