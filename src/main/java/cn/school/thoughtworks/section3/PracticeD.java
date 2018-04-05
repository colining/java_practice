package cn.school.thoughtworks.section3;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeD {
    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = countSameElements(collectionA);
        return getStringIntegerMap(object, map);

    }

    Map<String, Integer> countSameElements(List<String> collection1) {
        Stream<String> stringStream = collection1.stream().filter(s -> s.length()<2);
        Map<String, Integer> result = stringStream.collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        List<String> list = collection1.stream().filter(s -> s.length()>1).collect(Collectors.toList());
        list.forEach(s -> {
            if (s.contains("-")) {
                result.put(String.valueOf(s.charAt(0)), s.charAt(2)-48);
            }
        });
        return result;
    }

    private Map<String, Integer> getStringIntegerMap(Map<String, List<String>> object, Map<String, Integer> map) {
        object.values().forEach(list ->list.forEach(s -> {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) - map.get(s) / 3);
            }
        }));
        return map;
    }
}
