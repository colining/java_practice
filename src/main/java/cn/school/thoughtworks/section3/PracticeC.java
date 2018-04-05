package cn.school.thoughtworks.section3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = countSameElements(collectionA);
        return getStringIntegerMap(object, map);
    }

    private Map<String, Integer> getStringIntegerMap(Map<String, List<String>> object, Map<String, Integer> map) {

        object.values().forEach(list -> list.forEach(str ->{
            if (map.containsKey(str)) {
                map.put(str, map.get(str) - map.get(str)/3);
            }
        }));
        return map;
    }

    Map<String,Integer> countSameElements(List<String> collection1) {
//        //实现练习要求，并改写该行代码。

        Map<String, Integer> result = collection1.stream().collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        return result;
    }
}
