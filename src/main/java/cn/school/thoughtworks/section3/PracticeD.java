package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = countSameElements(collectionA);
        return getStringIntegerMap(object, map);

    }

    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : collection1) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else if (s.contains("-")) {
                hashMap.put(String.valueOf(s.charAt(0)), s.charAt(2) - 48);
            } else {
                hashMap.put(s, 1);
            }
        }
        return hashMap;
    }

    private Map<String, Integer> getStringIntegerMap(Map<String, List<String>> object, Map<String, Integer> map) {
        for (List<String> stringList : object.values()) {
            for (String s : stringList) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) - map.get(s) / 3);
                }
            }
        }
        return map;
    }
}
