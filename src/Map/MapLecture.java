package Map;

import java.util.Hashtable;

public class MapLecture {
    public static void main(String[] args) {
        Hashtable<String,Integer> map = new Hashtable<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent ("B", 2);

        System.out.println(map);
        System.out.println(map.get("C"));
        System.out.println(map.getOrDefault("C", -1));
    }
}
