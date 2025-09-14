import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] maze = new int[N][M];
        for(int i=0; i<N; i++){
            String row = sc.next();
            for(int j=0; j<M; j++){
                maze[i][j] = row.charAt(j) - '0';   
            }
        }
        sc.close();
        
        boolean[][] visited = new boolean[N][M];
        int[][] dist = new int[N][M];
        
        Queue<int[]> queue = new LinkedList<>();
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            
            for (int dir = 0; dir < 4; dir++) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                // 미로 범위 안이고, 방문 안 했고, 이동 가능 칸(1)인 경우
                if (nx >= 0 && ny >= 0 && nx < N && ny < M 
                    && maze[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    dist[nx][ny] = dist[x][y] + 1; // 이동 거리 +1
                }
            }
        }
        System.out.println(dist[N-1][M-1]);
    }
}