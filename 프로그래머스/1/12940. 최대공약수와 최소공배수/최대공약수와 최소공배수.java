import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);

        // 최소공배수 구하기
        answer[1] = n * m / gcd(n, m);
        
        return answer;
    }

    // 최대공약수 구하기
    public int gcd(int n, int m){
        while (m != 0){
            int tmp = m;
            m = n % m;
            n = tmp;
        }
        return n;
    }
}