package study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Java_02_4 {
    public static void main(String[] args) {
        // 1. 자료형 - 리스트(List)
        // 배열과 같이 여러 데이터를 담을 수 있는 자료형
        // 리스트 메소드
        // - add, get, size, remove, clear, sort, contains
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

        // 1-1 add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0, 1);
        System.out.println("l1 = " + l1);

        // 1-2 get
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

        // 1-3 size
        System.out.println(l1.size());

        // 1-4 remove
        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(2))); // List의 2라는 값을 찾아 제거.
        System.out.println("l1 = " + l1);

        // 1-5 clear
        l1.clear();
        System.out.println("l1 = " + l1);

        // 1-6 sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);

        // 1-7 contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

        // 2. 자료형 - 맵(Map)
        // key, value 형태로 데이터를 저장하는 자료형
        // 맵 메소드
        // - put, get, size, remove, containsKey
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

        // 2-1 put
        map.put("kiwi", 9000);
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);

        // 2-2 get
        System.out.println(map.get("mandarine"));
        System.out.println(map.get("kiwi"));

        // 2-3 size
        System.out.println(map.size());

        // 2-4 remove
        System.out.println(map.remove("kiwi")); // 제거하면서 값을 출력함
        System.out.println(map.remove("mandarine")); // 없는 key : null을 출력
        System.out.println("map = " + map);

        // 2-5 containsKey
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("kiwi"));

        // 3. 자료형 - 제네릭스(Generics)
        // 자료형을 명시적으로 지정
        // 제한적일 수 있지만 안정성을 높여주고 형변환을 줄여줌
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
        // l4.add(1); 제네릭때문에 String만 add할 수 있음.
        l4.add("apple");
        System.out.println("l4 = " + l4);

        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>();
        // map2.put(123, "id");
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);
    }
}