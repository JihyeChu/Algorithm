public class A02 {
    public static void main(String[] args) {
        int[] array= {421,233,123,522,234};
        int height = 333;
        int answer=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>height){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
