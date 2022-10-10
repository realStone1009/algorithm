package Set;

import java.util.HashSet;

public class SetTest02 {
    boolean solution(String[] words) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for(int i = 1 ; i < words.length; i++){
            set.add(words[i]);
            char lastChar = words[i-1].charAt(words[i-1].length()-1);
            if(!words[i].startsWith(String.valueOf(lastChar))){
                return false;
            } 
        }
        if(words.length != set.size()) answer = false;
        return answer;
    }
}

