package algorithmStudy.LinearSearch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
// search 는 imdexOf, contains, remove 같은 곳에서 이미 구현되어 있다. : 완전탐색
// equals 가 제공될 필요가 있다.
// 이진탐색 : Collections.binarySearch
// Comparable 가 구현되어 있어야 한다.
// 순서대로 정렬이 되어 있어야 한다.
class MyData implements Comparable<MyData>{
        int v;
        public MyData(int v){
            this.v = v;
        }

        
        @Override
        public String toString() {
            return "MyData [v=" + v + "]";
        }


        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + v;
            return result;
        }
        


        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MyData other = (MyData) obj;
            if (v != other.v)
                return false;
            return true;
        }



        @Override
        public int compareTo(MyData o) {
            // 1 == 1 1 - 1 =0 : 같다.
            // 1 ? 2 --> 1 - 2 == 0 : 같다.
            //                  < 0 : 오른쪽이 크다.
            //                  > 0 : 왼쪽이 크다.
            return v - o.v;
        }

    }
public class BinarySearch {
    
    
    //데이터가 선형으로 구성되어 있을때 어떻게 원하는것을 찾아 내는지에 대한 방법
    // int search(int[] nums, int s) throws Exception{
    //     for(int n : nums){
    //         if(n==s) return n;
    //     }
    //     throw new Exception("not found");
    // }

    public static void main(String[] args) {
        List<MyData> list = new LinkedList<>();
        Random r = new Random();
        for(int i = 1; i<=100;i++){
           list.add(new MyData(i));
           //r.nextInt(100)
        }
        System.out.println(list); 
        //순차적으로 계산하기 위해 정렬이 되어 있어야 한다.
        //랜덤한 값을 Binary search 하고 싶다면 정렬을 먼저 해주어야 한다.
        int index = Collections.binarySearch(list, new MyData(63));
        
        // System.out.println(list);
        // list.indexOf(new MyData(63));
        System.out.println(index);
    }
}
