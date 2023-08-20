package oop.sam02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, String> treeMap = new TreeMap<>();
        // Map<String, String> hashMap = new HashMap<>(); 과 같이 일반적으로 Map 인터페이스로 받는다.

        hashMap.put("B", "B-value");
        hashMap.put("A", "A-value");
        hashMap.put("D", "D-value");
        hashMap.put("C", "C-value");
        hashMap.put("B", "BB-value");

        linkedHashMap.put("B", "B-value");
        linkedHashMap.put("A", "A-value");
        linkedHashMap.put("D", "D-value");
        linkedHashMap.put("C", "C-value");
        linkedHashMap.put("B", "BB-value");

        treeMap.put("B", "B-value");
        treeMap.put("A", "A-value");
        treeMap.put("D", "D-value");
        treeMap.put("C", "C-value");
        treeMap.put("B", "BB-value");


        // 그냥 키 값만 중복 안되게, 보통 HashMap을 많이쓴다.
        // 해당 키에 대한 값을 가져오는 게 중요, 정렬은 큰 이슈가 아니다.
        for (String key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        // 넣는 순서대로
        System.out.println("------------------------");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + " : " + linkedHashMap.get(key));
        }

        // 정렬
        System.out.println("------------------------");
        for (String key : treeMap.keySet()) {
            System.out.println(key + " : " + treeMap.get(key));
        }

    }
}
