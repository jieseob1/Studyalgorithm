import java.util.*;
class Solution {
    private static class Position {
        private final int x;
        private final int y;
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private int getDistance(int x1, int y1, int x2, int y2) { //맨하탄 거리법 사용
        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String leftHandPosition ="*";
        String rightHandPosition ="#";
        StringBuilder sb = new StringBuilder();
        Map<String, Position> map = new HashMap(); 
        String[] pads= {"1", "2", "3" ,"4", "5", "6", "7", "8", "9", "*", "0", "#"};
        for(int i = 0; i < pads.length; i++) {
            System.out.println("x => " + (i % 3) + " y => " + (i /3));
            map.put(pads[i], new Position(i / 3,i % 3));
        }
        for (int number: numbers) {
            Position numberPosition = map.get(Integer.toString(number));
            System.out.println("Integer.toString(number) => " + Integer.toString(number));
            System.out.println(" x => " + numberPosition.x + " y => " + numberPosition.y);
            Position currentLeftHandPosition = map.get(leftHandPosition);
            Position currentRightHandPosition = map.get(rightHandPosition);
            int leftHandDistance = getDistance(numberPosition.x, numberPosition.y, currentLeftHandPosition.x, currentLeftHandPosition.y);
            int rightHandDistance = getDistance(numberPosition.x, numberPosition.y, currentRightHandPosition.x, currentRightHandPosition.y);
            
            if(leftHandDistance > rightHandDistance) { //오른손이 더 가깝다면
                rightHandPosition = Integer.toString(number);
                sb.append("R");
            } else if (leftHandDistance < rightHandDistance) {
                leftHandPosition = Integer.toString(number);
                sb.append("L");
            } else if (leftHandDistance == rightHandDistance) {
                if (hand == "right") {
                    sb.append("R");
                    rightHandPosition = Integer.toString(number);
                } else {
                    sb.append("L");
                    leftHandPosition = Integer.toString(number);
                }
            }
        }
        //규칙 
        // 왼쪽 엄지는 *에서 시작, 오른쪽은 #에서 시작
        //엄지 규칙 => 상하좌우 4가지 방향으로만 이동 가능
        //키패드 이동 한 칸은 거리 1
        //1,4,7 관련은 왼손 엄지
        //3,6,9 관련은 오른손
        //2,5,8,0은 더 가까운 엄지
        //거리가 같다면, 오른손잡이는 오른손
        //numbers => 1000
        //hand는 left or right
        //거리를 어떻게 구하냐가 중요 포인트 => 먼저 해당 하는 부분에 대해서 좌표 정보랑 거리 구하는 부분을 넣자
        return sb.toString();
    }
}