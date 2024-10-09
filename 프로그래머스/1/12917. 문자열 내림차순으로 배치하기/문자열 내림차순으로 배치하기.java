class Solution {
    public String solution(String s) {
        String answer = "";
        String newString = s.chars().boxed().sorted((v1,v2) -> v2 - v1).collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString(); 
        //supplier, accumulator, combiner가 들어가야 된다.
        //appendCodePoint를 써야지 정수가 들어가지 않고 문자 형식으로 들어감
        System.out.println("newString => " + newString);
        answer = newString;
        return answer;
    }
}