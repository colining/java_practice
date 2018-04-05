package cn.school.thoughtworks.section2;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Stream<String> stringStream = collection1.stream().filter(s -> s.length()<2);
        Map<String, Integer> result = stringStream.collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        List<String> list = collection1.stream().filter(s -> s.length()>1).collect(Collectors.toList());
        list.forEach(s -> {
            if (getNumber(s).length() > 0) {
                if (result.containsKey(String.valueOf(s.charAt(0)))) {
                    String key = String.valueOf(s.charAt(0));
                    int value = result.get(String.valueOf(s.charAt(0))) + Integer.parseInt(getNumber(s));
                    result.put(key,value);
                } else{
                    String key = String.valueOf(s.charAt(0));
                    int value = Integer.valueOf(getNumber(s));
                    result.put(key,value);

                }

            }
        });
        return result;
    }

    private String getNumber(String s) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        return m.replaceAll("").trim();
    }
}


