class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<Point> list = new ArrayList<Point>();
        for(int[] point : points) {
            list.add(new Point(point[0],point[1]));
        }
        Collections.sort(list);
        for ( Point point : list) {
            System.out.println("check pq point => " + point.x + " " + point.y);
        }
 
        int[][] arr = new int[k][2];
        for ( int i = 0; i < list.size(); i++) {
            if(i >= k) break;
            Point point = list.get(i);
            System.out.println("point.x => " + point.x + " point.y => " + point.y);
            arr[i][0] = point.x;
            arr[i][1] = point.y;
        }
        return arr;
    }
}

public class Point implements Comparable<Point> {
    public final int x;
    public final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

     private double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    @Override
    public int compareTo(Point o) {
        double thisDistance = this.distanceFromOrigin();
        double otherDistance = o.distanceFromOrigin();
        return Double.compare(thisDistance, otherDistance);
    }
}