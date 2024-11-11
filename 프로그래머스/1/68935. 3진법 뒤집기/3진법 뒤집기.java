class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        System.out.println(s);
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println(sb.toString());
        int num = Integer.parseInt(sb.toString(),3);
        System.out.println(num);
        return num;
    }
}