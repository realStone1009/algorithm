package Sort;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class MyData{
    int v;
    public MyData(int v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "v=" + v +
                '}';
    }
}
public class SortClass {
    public static void main(String[] args) {
        List<MyData> list = new LinkedList<>();
        Random r = new Random();
        for(int i = 0 ; i<20; i++) list.add(new MyData(r.nextInt(100)));
//        list.sort((o1, o2) -> o1.intValue() - o2.intValue());
        list.sort(new Comparator<MyData>() {
            @Override
            public int compare(MyData o1, MyData o2) {
                return o1.v - o2.v;
            }
        });
        System.out.println(list);
    }
}
