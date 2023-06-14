package Lv0;

import java.util.ArrayList;
import java.util.HashSet;

public class Lv0_4 {
    public static void main(String[] args) {
        // [이진수 더하기]
        String bin1 = "10";
        String bin2 = "11";
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int value = num1 + num2;
        answer = Integer.toBinaryString(value);
        System.out.println(answer);

    }
}
