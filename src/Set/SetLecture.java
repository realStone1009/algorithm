package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

class MyData {
    int v;

    public MyData(int v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "" + v;
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

    

    
}

public class SetLecture {
    public static void main(String[] args) {
       HashSet<MyData> setA = new LinkedHashSet<>();
       HashSet<MyData> setB = new LinkedHashSet<>();
        //A
        setA.add(new MyData(1));
        setA.add(new MyData(2));
        setA.add(new MyData(3));
        //B
        setB.add(new MyData(2));
        setB.add(new MyData(3));
        setB.add(new MyData(4));
        
        //A+B
        // setA.addAll(setB);
        //A-B
        // setA.removeAll(setB);
        //A*B
        setA.retainAll(setB);
        System.out.println(setA.toString());
    }
}
