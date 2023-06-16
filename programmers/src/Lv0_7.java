import java.util.ArrayList;
import java.util.Arrays;

public class Lv0_7 {
    public static void main(String[] args) {
//      [n의 배수 고르기]

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//     -----------------------------------------------------
//        int count = 0;
//        for(int num : numlist){
//            if(num % n == 0){
//                count++;
//            }
//        }
//
//        int[] result = new int[count];
//        int i = 0;
//        for(int num : numlist){
//            if(num % n == 0){
//                result[i] = num;
//                i++;
//            }
//        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i : numlist){
            if(i % n == 0){
                result.add(i);
            }
        }

        System.out.println(result);
    }
}