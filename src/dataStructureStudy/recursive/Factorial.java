package dataStructureStudy.recursive;

public class Factorial {
    public int factorialSum(int num) {
        int total = 1;
        if(num == 1) return 1;
        else
            System.out.println("num : " +num);
            System.out.println("total : " + total);
            total = num * factorialSum(num -1);
        System.out.println("total : " + total);
        return total;
    }
    public int factorialIter(int num ){
        int total = 1;
        for(int i = 1; i <= num; i++){
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
//        System.out.println(factorial.factorialSum(3));
        System.out.println(factorial.factorialIter(3));
    }
}
