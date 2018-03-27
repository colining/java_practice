package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> hashMap = new HashMap<>();
        for (String s : collection1) {
            int count = 0;
            String value = "";
            if (hashMap.containsKey(s)) {
                count = hashMap.get(s) + 1;
                value = s;
            } else if (getNumber(s).length() > 0) {
                if (hashMap.containsKey(String.valueOf(s.charAt(0)))) {
                    value = String.valueOf(s.charAt(0));
                    count = hashMap.get(String.valueOf(s.charAt(0))) + Integer.parseInt(getNumber(s));
                } else{
                    value = String.valueOf(s.charAt(0));
                    count = Integer.valueOf(getNumber(s));
                }
            } else {
                value = s;
                count = 1;
            }
            hashMap.put(value, count);
        }
        return hashMap;
    }

    private String getNumber(String s) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        String a = m.replaceAll("").trim();
        return m.replaceAll("").trim();
    }
}

