/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // pm => 새로운 roduct 만들려고 함
    // quality check 실패함 => 최신 버전
    // 각 버전은 이전버전에 기반해서 개발됨
    //bad version 다음은 bad version=
    //n개의 버전이 있다.=> 첫 bad one을 찾으려고 한다.
    // isBadVersion이라는 정보가 있음
    // 해당 api를 최대한 줄여야 됨
    public int firstBadVersion(int n) {
        int left =1;
        int right = n;
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)) { //그럼 전으로 돌아가 봐야 함
                result = mid;
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        return result;
    }
}