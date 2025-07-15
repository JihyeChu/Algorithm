class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(String word : dic){
            boolean flag = true;
            for(String s : spell){
                if(!word.contains(s)){
                    flag = false;
                    break;
                }
            }
            if(flag) return 1;
        }
        return 2;
    }
}