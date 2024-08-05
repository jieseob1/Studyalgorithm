class Solution {
    public int[] solution(int brown, int yellow) {
        //brown + yellow => 2,005,000 
        //가로 >= 세로
        int[] answer = new int[2];
        for( int width = 3; width <= 2000; width++) {
            for(int height = 3; height <= 2000; height++) {
                if(!isWidthBigger(width, height)) continue;
                
                if(isBorderMatch(brown, width, height) && isInnerMatch(yellow, width,height)) {
                    answer[0] = width;
                    answer[1] = height; //한번에 적용하는 방법 확인
                    return answer;
                }
            }
        }
        return answer;
    }
    
    private boolean isBorderMatch(int brown, int width, int height) {
        if((2 * width + 2 * (height -2)) == brown) {
            return true;
        }
        return false;
    }
    
    private boolean isInnerMatch(int yellow, int width, int height) {
        if((width -2) * (height -2) == yellow) {
            return true;
        }
        return false;
    }
    
    private boolean isWidthBigger(int width, int height) {
        if( width >= height) {
            return true;
        }
        return false;
    }
}