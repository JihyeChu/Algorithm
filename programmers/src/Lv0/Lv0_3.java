package Lv0;

import java.util.ArrayList;
import java.util.HashSet;

public class Lv0_3 {
    public static void main(String[] args) {
//       [직사각형 넓이 구하기]
//       아 진짜 이게 lv0이야..?
        int answer = 0;
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        HashSet<Integer> xc=new HashSet<Integer>();     //x좌표를 담을 set
        for(int i=0; i<4; i++) {
            xc.add(dots[i][0]);
        }
        ArrayList<Integer> arr1=new ArrayList<Integer>(xc);
        int x1=arr1.get(0);                             //첫번째 x좌표
        int x2=arr1.get(1);                             //두번째 x좌표

        HashSet<Integer> yc=new HashSet<Integer>();        //y좌표를 담을 set
        for(int i=0; i<4; i++) {
            yc.add(dots[i][1]);
        }
        ArrayList<Integer> arr2=new ArrayList<Integer>(yc);
        int y1=arr2.get(0);                              //첫번째 y좌표
        int y2=arr2.get(1);                              //두번째 y좌표

        answer=Math.abs((x1-x2)*(y1-y2));
        System.out.println(answer);
    }

}
