package Exam;

import java.util.*;
import java.util.stream.Collectors;

public class LottoExam {

    public int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i = 0; i<6; i++){
            if(lottos[i]==win_nums[i]){
                match++;
            }
            if(lottos[i] == 0){
                zero++;
            }
        }
        int min = prize(match);
        int max = prize(match+zero);
        return new int[] {max,min};
    }

    public int[] newSolution(int[] lottos, int[] win_nums) {
        int match = 0;
        List<Integer> lottosList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> winList = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        int zeroCount = Collections.frequency(lottosList, Integer.valueOf(0));
        while(lottosList.remove(Integer.valueOf(0)));

        for(int i = 0; i<lottosList.size(); i++){
            if(winList.contains(lottosList.get(i))){
                match++;
            }
        }
        return new int[] {prize(match),prize(match+zeroCount)};
    }

    public int prize(int n){
        switch (n){
            case 2:n = 5; break;
            case 3:n = 4; break;
            case 4:n = 3; break;
            case 5:n = 2; break;
            case 6:n = 1; break;
            default: n = 6; break;
        }
        return n;
    }

    public static void main(String[] args) {
        LottoExam lotto = new LottoExam();
        int[] ar1 = new int[]{44, 1, 0, 0, 31, 25};
        int[] ar2 = new int[]{31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(lotto.newSolution(ar1,ar2)));
    }
}
