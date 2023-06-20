
public class A03 {
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] route = {"E 2","S 5","W 1"};
        String[][] pp = new String[park.length][park[0].length()];
        // 43
        for (int i = 0; i < park.length ; i++) {
            for (int j = 0; j <park[i].length() ; j++) {
                pp[i][j] = String.valueOf(park[i].charAt(j));
            }
        }
        //park를 2차 배열로 바꿔야될거 같은데
        //현재 좌표 2차 배열의 s인 부분
        //p[i][j] = s , x=i ,y=j


        //route for문으로 char로 잘라서
        //switch문으로 동서남북일때 int만큼 움직이기

        //움직이기전에 조건 확인해야됨.........
        //벗어나는건 확인 가능

        //주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
        //주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
        Integer[] answer = new Integer[2];
        for (int i = 0; i <pp.length ; i++) {
            for (int j = 0; j < pp[i].length ; j++) {
                String s = pp[i][j];  // p01
                if(s.equals("S")){
                    int x = i;
                    int y = j;
                    for (int k = 0; k < route.length ; k++) {
                        switch (route[k].charAt(0)) {
                            case 'E' :
                                int my = (int) route[k].charAt(2)-'0';
                                if(my+y>pp[x].length-1){
                                    break;
                                }
                                y += my;
                                break;
                            case 'W' :
                                int my2 = (int) route[k].charAt(2)-'0';
                                if(my2+y>pp[x].length-1){
                                    break;
                                }
                                y -= my2;
                                break;
                            case 'N' :
                                int mx = (int) route[k].charAt(2)-'0';
                                if(mx+x>pp.length-1){
                                    break;
                                }
                                x -= mx;
                                break;
                            case 'S' :
                                int mx2 = (int) route[k].charAt(2)-'0';
                                if(mx2+x>pp.length-1){
                                    break;
                                }
                                x += mx2;
                                break;
                        }
                        answer[0] = x;
                        answer[1] = y;
                    }
                }
            }
        }

    }
}
