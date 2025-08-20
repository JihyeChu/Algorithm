import java.util.*;
class Solution {
    public int solution(int[][] board) {
        int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

        Set<String> danger = new HashSet<>();
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 1){
                    for(int k=0; k<9; k++){
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < board.length && nj >=0 && nj < board.length) {
                            danger.add(ni + "_" + nj);
                        }
                    }
                }
            }
        }

        return board.length * board.length - danger.size();    
    }
}