package com.cm.test.study;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionTest {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

        // 1.1 使用匿名内部类根据name排序players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2));
            }
        });

        // 1.2 使用lambda排序
        Comparator<String> comparator = (String o1, String o2) -> o1.compareTo(o2);
        Arrays.sort(players);
        // 1.3 更好方式：
        Arrays.sort(players, (String o1, String o2) -> o1.compareTo(o2));
    }
}
