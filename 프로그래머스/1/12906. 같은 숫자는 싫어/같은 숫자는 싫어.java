import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }

        int[] answer = new int[length];
        int count = 0;
        answer[count++] = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] != arr[i - 1]) {
                answer[count++] = arr[i];
            }
        }

        // 남은 부분만큼 배열을 잘라서 반환
        return Arrays.copyOf(answer, count);
    }
}