package cn.school.thoughtworks.section2;

import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
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
}
