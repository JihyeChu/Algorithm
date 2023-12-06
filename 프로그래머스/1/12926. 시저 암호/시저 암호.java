class Solution {
   public String solution(String s, int n) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append(c);
            } else {
                char word = Character.isLowerCase(c) ? 'a' : 'A';
                int shift = (c - word + n) % 26;
                sb.append((char) (word+shift));
            }
        }
        return sb.toString();
    }
}