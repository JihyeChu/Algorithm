class Solution {
   public int solution(String dartResult) {
        int[] chances = new int[3];
        int num = 0;
        int index = 0;
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            } else if (c == 'S' || c == 'D' || c == 'T') {
                int bonus = (c == 'S') ? 1 : (c == 'D') ? 2 : 3;
                chances[index++] = (int)Math.pow(num, bonus);
                num = 0;
            } else if (c == '*' || c == '#') {
                if(c == '*'){
                    chances[index-1] *= 2;
                    if(index-2 >= 0){
                        chances[index-2] *= 2;
                    }
                }else{
                    chances[index-1] *= -1;
                }
            }
        }

        int answer = 0;
        for(int chance : chances){
            answer += chance;
        }

        return answer;
    }
}