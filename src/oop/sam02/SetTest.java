package oop.sam02;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        // Set<String> hashSet = new HashSet<>(); 과 같이 일반적으로 Set 인터페이스로 받는다.

        hashSet.add("4");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("1");
        hashSet.add("4");

        linkedHashSet.add("4");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("1");
        linkedHashSet.add("4");

        treeSet.add("4");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("1");
        treeSet.add("4");

        Iterator<String> hashSetIterator = hashSet.iterator();
        while (hashSetIterator.hasNext()) {
            System.out.println(hashSetIterator.next());
        }
        System.out.println("-----------------------");
        Iterator<String> linkedhashSetIterator = linkedHashSet.iterator();
        while (linkedhashSetIterator.hasNext()) {
            System.out.println(linkedhashSetIterator.next());
        }


        System.out.println("-----------------------");
        // 정렬돼서 출력
        Iterator<String> treeSetIterator = treeSet.iterator();
        while (treeSetIterator.hasNext()) {
            System.out.println(treeSetIterator.next());
        }
        System.out.println("-----------------------");
    }
}
