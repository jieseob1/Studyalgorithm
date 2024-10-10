
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[][] dots) {
        for(int i = 0 ; i < dots.length;i++) {
            for (int j = i+1; j < dots.length; j++) {
                double slope = getSlope(dots[i][0],dots[i][1], dots[j][0],dots[j][1]);
                List<Integer> list = new ArrayList<>();
                for(int k = 0 ; k < dots.length; k++) {
                    if (k != i && k != j) {
                        list.add(k);
                    }
                }
                double otherSlope = getSlope(dots[list.get(0)][0],dots[list.get(0)][1],dots[list.get(1)][0],dots[list.get(1)][1]);
                if(slope == otherSlope) {
                    return 1;
                }
            }
        }
        return 0;
    }
    private double getSlope(int x1,int y1, int x2, int y2) {
        return (double)(y2-y1) / (x2-x1);
    }
}