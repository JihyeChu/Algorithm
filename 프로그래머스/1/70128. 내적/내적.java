class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int hap = 0;
        for(int i=0; i<a.length; i++){
            hap = a[i]*b[i];
            answer = answer+hap;
        }

        return answer;
    }
}