package dataStructureStudy.recursive;

public class fibonacci {

    public int fibonacciRecur(int num) {
        if(num == 0 ) return 0;
        if(num == 1 ) return 1;

        return fibonacciRecur(num -1) + fibonacciRecur(num -2);

    }

    public int fibonacciMem(int num) {

        int[] values = new int[num+1];
        values[0] = 0;
        values[1] = 1;
        int i ;
        for(i = 2; i <= num; i++) {
            values[i] = values[i-1] + values[i-2];
        }
        return values[i-1];
    }
    public static void main(String[] args) {

        fibonacci fibonacci = new fibonacci();
        System.out.println(fibonacci.fibonacciRecur(6));
        System.out.println(fibonacci.fibonacciMem(6));
    }
}
