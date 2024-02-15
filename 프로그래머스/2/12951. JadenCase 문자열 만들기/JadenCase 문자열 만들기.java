class Solution {
   public String solution(String s) {
    StringBuilder answer = new StringBuilder();
    boolean first = true; // 단어의 첫 문자 여부를 저장하는 변수

    for (char ch : s.toCharArray()) {
        if (first) { // 현재 문자가 단어의 첫 문자인 경우
            answer.append(Character.toUpperCase(ch)); // 대문자로 변환하여 추가
            first = false; // 다음 문자부터는 첫 문자가 아님을 표시
        } else { // 현재 문자가 단어의 첫 문자가 아닌 경우
            answer.append(Character.toLowerCase(ch)); // 소문자로 변환하여 추가
        }

        if (Character.isWhitespace(ch)) { // 현재 문자가 공백인 경우
            first = true; // 다음 문자부터는 다시 첫 문자가 될 수 있도록 설정
        }
    }

    return answer.toString();
}
}