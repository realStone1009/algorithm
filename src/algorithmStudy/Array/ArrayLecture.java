package algorithmStudy.Array;

import java.util.List;
import java.util.Vector;

class MyData {
    int value;
    
    public MyData(int value) {
        this.value = value;
    }

    static MyData create(int v) {
        return new MyData(v);
    }

    @Override
    public String toString() {
        return "MyData [value=" + value + "]";
    }
    @Override
    public boolean equals(Object obj) {
        MyData myData = (MyData) obj;
        return value == myData.value;
    }
}
    
public class ArrayLecture {
    public static void main(String[] args) throws Exception {
        List<MyData> list = new Vector<>();
        list.add(MyData.create(1));
        list.add(MyData.create(2));
        list.add(MyData.create(2));

        method1(list);

    }
    static void method1(List<MyData> list){
        System.out.println(list.size());

    }
}
