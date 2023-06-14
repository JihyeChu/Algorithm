package Lv0;

import java.util.Arrays;

public class Lv0_5 {

    public static void main(String[] args) {
        // [연속된 수의 합]
        int num = 3;
        int total = 12;
        int[] answer = new int[num];
        int sum = 0;
        int count = 0;

        for(int i = -100; i <= 300; i++) {
            sum = 0;
            for(int j = i; j < i+num; j++) {
                sum += j;
            }
            if(sum == total) {
                for(int k=0; k < num; k++) {
                    answer[k] = i + k;
                    System.out.println(answer[k]);
                }
                break;
            }
        }
//        for(int i=count; i<count+num; i++){
//            sum += count;
//            if(sum < total){
//                count++;
//            }else if(sum > total){
//                count--;
//            }else if(sum == total){
//                break;
//            }
//
//            answer[i] = count + i;
//        }

    }

}
