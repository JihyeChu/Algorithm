package Lv0;

public class Lv0_2 {
    public static void main(String[] args) {
        // 머쓱이 보다 키 큰 사람
        int array[] = {149, 180, 192, 170};
        int height = 167;
        int answer = 0;
        for(int i : array){
            if(i > height){ answer++; }
        }
        System.out.println(answer);

    }
}
