import java.util.LinkedList;
import java.util.Queue;
class Solution {
      public boolean solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        int leftCount = 0;
        int rightCount = 0;
        
        // 문자열을 큐에 넣기
        for (char ch : s.toCharArray()) {
            queue.offer(ch);
        }
        
        // 큐의 첫 번째 문자가 ')'인 경우 false 반환
        if (!queue.isEmpty() && queue.peek() == ')') {
            return false;
        }
        
        // 큐를 순회하면서 괄호 개수 카운트
        while (!queue.isEmpty()) {
            char ch = queue.poll();
            if (ch == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
            
            // 오른쪽 괄호가 왼쪽 괄호보다 많을 경우 false 반환
            if (rightCount > leftCount) {
                return false;
            }
        }
        
        // 왼쪽 괄호와 오른쪽 괄호의 개수가 다르면 false 반환
        if (leftCount != rightCount) {
            return false;
        }
        
        return true;
    }
}