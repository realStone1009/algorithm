package algorithmStudy.NonLinearSearch;

public class Test02 {
    public int solution(int[] numbers, int target){
        return sumCount(numbers,target,0,0);
    }

    public int sumCount(final int[] numbers, final int target, int i, int sum) {
        if(i == numbers.length){
            if(sum==target) return 1;
            return 0;
        }
        return  sumCount(numbers, target, i+1,sum + numbers[i])
                + sumCount(numbers, target, i+1,sum - numbers[i]);
    }

    public static void main(String[] args) {
        Test02 t02 = new Test02();
        System.out.println(t02.solution(new int[]{1,1,1,1,1},3));

    }
}
