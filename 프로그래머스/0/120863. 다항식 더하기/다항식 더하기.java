class Solution {
    public String solution(String polynomial) {
        String[] temp = polynomial.split(" \\+ ");
        int xSum = 0;
        int nSum = 0;
        
        for(String t : temp){
            if(t.contains("x")){
                String str = t.replace("x", "");
                if(str.equals("")){
                    xSum += 1;
                }else{
                    xSum += Integer.parseInt(str);
                }
            }else{
                nSum += Integer.parseInt(t);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        if(xSum > 0){
            if(xSum == 1){
                sb.append("x");
            }else{
                sb.append(xSum).append("x");
            }
        }
        if(nSum > 0){
            if(sb.length() > 0) sb.append(" + ");
            sb.append(nSum);
        }
        
        return sb.toString();
    }
}