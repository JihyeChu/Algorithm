class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = toBinary(n);
        
        while(true){
            int current = toBinary(++n);
            if(current == count){
                answer = n;
                break;
            }
        }

        return answer;
    }

    private int toBinary(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        char[] b = binary.toCharArray();
        for(int i=0; i<b.length; i++){
            if(b[i] == '1'){
                count++;
            }
        }
        return count;
    }
}