import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, int[]> map = new HashMap<>();
        map.put('1', new int[]{0,0});
        map.put('2', new int[]{0,1});
        map.put('3', new int[]{0,2});
        map.put('4', new int[]{1,0});
        map.put('5', new int[]{1,1});
        map.put('6', new int[]{1,2});
        map.put('7', new int[]{2,0});
        map.put('8', new int[]{2,1});
        map.put('9', new int[]{2,2});
        map.put('*', new int[]{3,0});
        map.put('0', new int[]{3,1});
        map.put('#', new int[]{3,2});

        int[] leftHand = map.get('*');
        int[] rightHand = map.get('#');

        for(int num : numbers){
            char numchar = (char)('0' + num);
            int[] position = map.get(numchar);
            if(num == 1 || num == 4 || num == 7){
                sb.append("L");
                leftHand = position;
            } else if (num == 3 || num == 6 || num == 9) {
                sb.append("R");
                rightHand = position;
            }else {
                int left =  Math.abs(leftHand[0] - position[0]) + Math.abs(leftHand[1] - position[1]);
                int right = Math.abs(rightHand[0] - position[0]) + Math.abs(rightHand[1] - position[1]);
                if(left < right || (left == right && hand.equals("left"))){
                    sb.append("L");
                    leftHand = position;
                }else {
                    sb.append("R");
                    rightHand = position;
                }

            }
        }

        return sb.toString();
    }
}