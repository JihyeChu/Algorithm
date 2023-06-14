import java.util.ArrayList;


public class A07 {
    public static void main(String[] args) {
        int n = 12;
        int[] numList = {2, 100, 120, 600, 12, 12};

        //1 ≤ n ≤ 10,000
        //
        // 1 ≤ numlist의 원소 ≤ 100,000
        ArrayList<Integer> arrayList = new ArrayList<>();
        //n을 곱해가면서
        //numlist 에 들어있는 숫자 1개씩 비교

        for (int i = 0; i < numList.length; i++){
            for (int j = 0; j < 100000; j++){
                int x = n*(j+1);
                if(numList[i]==x){
                    arrayList.add(x);
                }
            }
        }

            //넘버리스트에서 x를 비교할게아니고
            //x를 계속 배수로 키우면서 넘버리스트에 1개씩 비교해야
            // 순서대로 나옴..
//        for (int i = 0; i < numList.length; i++) {
//            int x = n * (i + 1); // x = 3*(1+1) = 6 // 3*(2+1) = 9
//            for (int j = 0; j < numList.length; j++) {
//                if (numList[j] == x) { //6==6 // 9==9
//                    arrayList.add(x);
//                }
//            }
//
//        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
            System.out.println(answer[i]);
        }

    }


}

