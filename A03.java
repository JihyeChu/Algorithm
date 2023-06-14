public class A03 {
    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        //valueof 는 원래 기본형<->참조형
        //뒤에 매개변수로 2진법으로 교환해주는게 있음.
        //즉 참조변수 String 을 int타입으로 변경할때 2진법으로변경
        int a = num1+num2;
        //더한다음 10진법
        String answer = Integer.toBinaryString(a);
        //다시 스트링으로 변경할떄 toBinaryString 쓰면 스트링으로 변경해주는데 10진법을 2진법으로 표기해서 변
        //16진수(toHexString​) 8진수(toOctalString) 변환
        System.out.println(answer);

    }
}
