class Solution {
    public int solution(int[][] dots) {
        int topX = dots[0][0];
        int botX = dots[0][0]; 
        int topY = dots[0][1]; 
        int botY = dots[0][1]; 

        for(int[] x : dots) {
            if(x[0] >= topX) {
                topX = x[0];
            } else {
                botX = x[0];
            }
            if(x[1] >= topY) {
                topY = x[1];
            } else {
                botY = x[1];
            }
        }
        return (topX - botX) * (topY - botY);
    }
}