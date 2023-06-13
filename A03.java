import java.util.Arrays;

public class A03 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1}, // 00=-1,01=-1
                {2,1}, // 10=1,11=1
                {2,2}, // 20=2, 21=-2
                {1,2}, // 30=-1, 31=2
        };
        int max_x = 1;
        int min_x = 1;
        int max_y = 1;
        int min_y = 1;

        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if (a[j][i]>=max_x){
                    max_x=a[j][i];
                }
                if(a[j][i]<=min_x){
                    min_x=a[j][i];
                }
            }
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                if (a[i][j]>=max_y){
                    max_y=a[i][j];
                }
                if(a[i][j]<=min_y){
                    min_y=a[i][j];
                }
            }
        }


        System.out.println(max_x);
        System.out.println(min_x);
        System.out.println(max_y);
        System.out.println(min_y);
        int answer = 0;
        int x = max_x-min_x;
        System.out.println(x);
        int y = max_y-min_y;
        System.out.println(y);
        answer = x*y;
        System.out.println(answer);
    }
}
