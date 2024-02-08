class Solution {
       public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase(); 
        answer = answer.replaceAll("[^a-z0-9-_.]", ""); 
        answer = answer.replaceAll("[.]+", "."); 

        if(answer.startsWith(".") || answer.endsWith(".")) {
            if (answer.length() > 0) {
                if (answer.startsWith("."))
                    
                    answer = answer.substring(1);

                if (answer.endsWith("."))
                    answer = answer.substring(0, answer.length() - 1);
            }

            if (answer.length() == 0)
                answer = "a";
        }

        if (answer.length() >= 16) {
            answer = answer.substring(0, 15); 
            if (answer.endsWith("."))
                answer = answer.substring(0,answer.length() - 1);
        }


        String last = answer.substring(answer.length() - 1);
        while (answer.length() < 3) {
            answer += last;
        }

        return answer;
    }
}