import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Line  implements  Comparable<Line>{
    private int start;
    private int end;

    public Line(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Line o) {
        if (this.start == o.start) {
            return o.end - this.end; // 이 부분 로직
        } else {
            return this.start - o.start;
        }
    }
}

public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            lines.add(new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(lines);

        int start = lines.get(0).getStart();
        int end = lines.get(0).getEnd();
        int sum = 0;
        for (Line line : lines) {
            if (end < line.getStart()  ) {
                sum += (end - start);
                start = line.getStart();
                end = line.getEnd();//해당 부분 두 줄 추가
                continue;
            }
            if (end < line.getEnd()) {
                end = line.getEnd();
            }
        }
        sum += (end - start);
        System.out.println(sum);

    }
    public static void main(String[] args) throws IOException {
        Main.solution();
    }
}