package algorithmStudy.QueStack;

import java.util.Stack;

public class Test01 {
    boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c =='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
            return stack.isEmpty() == true ;
    }
    
    boolean intSolution(String s){
        int checkCount = 0;
        for(char c : s.toCharArray()){
            if(c =='('){
                checkCount++;
            }else{
                if(checkCount == 0) return false;
                checkCount--;
            }
        }
        return checkCount == 0;
    }
}
