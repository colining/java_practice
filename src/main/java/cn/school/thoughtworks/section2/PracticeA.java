package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : collection1) {
//            if (hashMap.containsKey(s)) {
//                hashMap.put(s, hashMap.get(s) + 1);
//
//            }else {
//                hashMap.put(s, 1);
//            }
            hashMap.put(s, 1 + (hashMap.get(s) != null ? hashMap.get(s) : 0));
        }
        return hashMap;
    }
}
