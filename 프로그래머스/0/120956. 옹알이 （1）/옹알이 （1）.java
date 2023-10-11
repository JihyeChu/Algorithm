class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String word : babbling){
            if(babblingCheck(word)){
                answer++;
            }
        }
        return answer;

    }

    public boolean babblingCheck(String word){
        while(word.length() > 0){
            if(word.startsWith("aya") || word.startsWith("woo")){
                word = word.substring(3);
            } else if (word.startsWith("ye") || word.startsWith("ma")) {
                word = word.substring(2);
            }else{
                return false;
            }
        }
        return  true;
    }
}