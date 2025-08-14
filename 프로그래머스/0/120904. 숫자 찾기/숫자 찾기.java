class Solution {
    public int solution(int num, int k) {
        String numStr = Integer.toString(num);
        String index = Integer.toString(k);

        int answer = numStr.indexOf(index);
        return answer < 0 ? -1 : answer + 1;
    }
}