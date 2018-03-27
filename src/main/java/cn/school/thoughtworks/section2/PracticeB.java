package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : collection1) {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else if (s.contains("-")) {
                hashMap.put(String.valueOf(s.charAt(0)), s.charAt(2)-48);
            } else {
                hashMap.put(s, 1);
            }
        }
        return hashMap;
    }
}
