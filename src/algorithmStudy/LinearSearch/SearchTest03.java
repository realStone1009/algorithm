package algorithmStudy.LinearSearch;

import java.util.Arrays;

public class SearchTest03 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s : skill_trees){
            String s2 = s.replaceAll("[^"+skill+"]","");
            if(skill.startsWith(s2)) answer++;
        }
        return answer;
    }
    public int streamSolution(String skill, String[] skill_trees){
        return (int) Arrays.stream(skill_trees)
                .map(s -> s.replaceAll("[^"+skill+"]",""))
                .filter(s-> skill.startsWith(s))
                .count();
    }
}

