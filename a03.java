import java.util.ArrayList;
import java.util.Arrays;

public class a03 {
    public static void main(String[] args) {
        //int 배열을 Integer타입으로 바꿔줘야 Arraylist에 넣기 편해서
        //그냥 꺼내서 넣어도됨.
        int [] numm ={3,3,3,2,2,4};
        Integer[] num = new Integer[numm.length];
        for (int i = 0; i <numm.length ; i++) {
            num[i]=numm[i];
        }
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(num));
        ArrayList<Integer> x = new ArrayList<>();
        int a = nums.size()/2;
        //조건 2개
        //1. 임의이 arraylist만들고 배열의 중복을 제거.
        //*다른 정답자 풀이 set 중복x 안되니까 더 깔끔하게 가능;;
        //2. 중복을 제거하지만, 뽑기의 횟수만큼 배열이 커서는 안됨.

        for (int i = 0; i <nums.size() ; i++) {
            if(!x.contains(nums.get(i))){
                if (x.size()<a){
                    x.add(nums.get(i));
                }

            }
        }
        System.out.println(x.size());
        //뽑을 수 있는 숫자 3개 , x 에서 중복된 수를 제거한 남은숫자 3개     //결과 3
        //뽑을수 잇는 숫자 2개, 중복을 제거한 남은 숫자 3개                //결과 2
        //뽑을 수 잇는 숫자 3개, 중복을 제거한 남은 숫자 2개               //결과 2



    }
}
