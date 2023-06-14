public class A06 {
    public static void main(String[] args) {
        String[] id_pw = new String[2];
        id_pw[0] = "id1";
        id_pw[1] = "1234";
        String[][] db;
        db = new String[][]{
                {"id1", "1234"},
                {"dqw", "sdd"}
        };

        //for문으로 아이디, 비밀번호 확인
        //if문 이중으로 아이디 확인 후 비밀번호 확인
        //배열 index value 값 확인 할때 꼭 equals 씁시다..

        String answer = "";
        for (int i = 0; i <db.length ; i++) {
            if(db[i][0].equals(id_pw[0])){
                if (db[i][1].equals(id_pw[1])){
                    answer = "login";
                    break;
                } else {
                    answer = "wrong pw";
                    break;
                }
            } else {
                answer = "fail";
            }
        }
        System.out.println(answer);
    }
}
