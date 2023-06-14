public class A04 {
    public static void main(String[] args) {

        //num = 1; // x // num*x                            + 0       num 1-1 = 0  //
        //num = 2; // x + (x+1) // 2x+1 // num*x            + 1       num 2-1 + num 1-1   // 1+0
        //num = 3; // x+(x+1)+(x+1+1)//3*x+3 // num*x       + 3       num 3-1 + num 2-1 + num1-1   // 2+1
        //num = 4; // x+(x+1)+(x+1+1)+(x+1+1+1) num*x       + 6       num 4-1 + num 3-1 + num2-1 + num1-1   // 3+2+1+0
        //num = 5; // x+x+1+x+1+1+x+1+1+1+x+1+1+1+1 //num*x +10       num 5-1 + num 4-1   //4+3+2+1+0
        //방정식 : total = num*x + num-1++; // x = (total-count)/ (num-1)++;

        int num = 3;
        int total = 12;

        int count =0;
        for (int i = 0; i <num ; i++) {
            count +=i;
        }


        int x = (total-count)/num;
        //total = num * x + count;

        int[] answer = new int[num];
        for (int i = 0; i <num ; i++) {
            answer[i] = x+i;
        }

        System.out.println(answer[0]);

    }
}
