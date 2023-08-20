package oop.sam02;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

public class LintTest {

    public static void main(String[] args) {
        // ArrayList를 자주 씀.
        // LinkedList는 넣고 빼고를 많이 하는 경우면 채택하면 좋으나, 그런 경우가 적다.
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        // List<String> arrayList = new ArrayList<>(); 과 같이 일반적으로 List 인터페이스로 받는다.

        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("D");
        arrayList.add("C");
        arrayList.add("A");

        linkedList.add("B");
        linkedList.add("A");
        linkedList.add("D");
        linkedList.add("C");
        linkedList.add("A");

        for (String x : arrayList) {
            System.out.println(x);
        }
        System.out.println("-------------------");
        for (String x : linkedList) {
            System.out.println(x);
        }
    }
}
