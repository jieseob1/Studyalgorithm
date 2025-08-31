import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
        String C = "Example";
        System.out.println(solution(S, C));
    }

    /**
     * @param S
     * @param C
     * @return
     */
    /*
    신입 사원의 이름 목록 제공
    각각의 신입사원에 대해서 회사 이메일 주소 생성해야된다.
    이름은 공백으로 구분된 이름, 중간이름 (optional), 성 으로 두가지 또는 세가지 조합으로 구성된다.
    각 부분은 영어 대소문자만으로 이루어져 있다. 단 성은 -처럼 하이픈으로 구분될 수 있다.
    각 주소는 FirstMiddleLast@Company.com 같은 형식을 사용해야 된다.
    주소는 소문자여야 하고 하이픈 포함 하면 안된다.
    두명 이상의 사람이 동일한 이메일을 사용하게 되면, @ 기호 앞에 숫자 추가
    jd@Company,com, jd2@Company.com 처럼
    S:는 이름, C:는 회사이름
    First: 이름의 이니셜
    Middle: 중간이름의 이니셜 (중간이름이 없는 경우에는 생략)
    Last: 성을 나타내며, 최대 8개의 이니셜 문자로 짤린다.
     */
    public static String solution(String S, String C) {
        StringBuilder result = new StringBuilder();
        String[] nameList = S.split(", ");
        Map<String, Integer> emailCountMap = new HashMap<>();
        for (int i = 0; i < nameList.length; i++) {
            String fullName = nameList[i];
            String[] nameParts = fullName.split(" ");

            String firstName = nameParts[0];
            String middleName = nameParts.length == 3 ? nameParts[1] : "";
            String lastName = nameParts[nameParts.length - 1].replace("-", "").toLowerCase();

            if (lastName.length() > 8) {
                lastName = lastName.substring(0, 8);
            }
            String emailId = (firstName.charAt(0) + (middleName.isEmpty() ? "" : String.valueOf(middleName.charAt(0))) + lastName).toLowerCase();

            int count = emailCountMap.getOrDefault(emailId, 0);
            String finalEmailId = emailId;
            if (count > 0) {
                finalEmailId += (count + 1);
            }

            emailCountMap.put(emailId, count + 1);
            String email = finalEmailId + "@" + C.toLowerCase() + ".com";

            result.append(fullName).append(" <").append(email).append(">");
            if (i != nameList.length - 1) result.append(", ");
        }
        return result.toString();
    }
}
