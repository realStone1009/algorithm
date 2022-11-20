package LinearSearch;


import java.util.ArrayList;
import java.util.List;

public class BinarySearch01 {
     public <T extends Comparable> T binarySearch(List data , T target){
        int min = 0;
        int max = data.size();
        while(min < max){
            int mid = (max - min) /2 + min;
            T m = (T) data.get(mid);
            int c = m.compareTo(target);
            if(c==0) return m;
            if(c < 0 ) min = mid + 1;
            else max = mid;
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int t = 9;

        BinarySearch01 bs = new BinarySearch01();
        bs.binarySearch(list,t);


    }
}
