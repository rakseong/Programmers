class Solution {
    public String solution(String new_id) {
        String match = "[^a-z0-9-_.]";
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll(match,"");

        while(new_id.indexOf("..") != -1)
            new_id = new_id.replace("..",".");
        answer = new_id;

        if(answer.startsWith("."))
            answer = answer.substring(1);
        else if(answer.endsWith("."))
                answer = answer.substring(0,answer.length()-1);

        if(answer.length() == 0)
            answer = "a";

        if(answer.length()>=16){
            answer = answer.substring(0,15); 
        }
        if(answer.endsWith("."))
            answer = answer.substring(0,answer.length()-1);

        if(answer.length()<=2){
            while(answer.length() != 3)
                answer += answer.charAt(answer.length()-1);
    }
        return answer;
    }
}
