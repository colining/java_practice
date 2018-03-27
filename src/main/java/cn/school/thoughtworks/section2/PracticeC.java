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
        for (String str : collection1) {
            int value;
            String key;
            if (hashMap.containsKey(str)) {
                value = hashMap.get(str) + 1;
                key = str;
            } else if (getNumber(str).length() > 0) {
                if (hashMap.containsKey(String.valueOf(str.charAt(0)))) {
                    key = String.valueOf(str.charAt(0));
                    value = hashMap.get(String.valueOf(str.charAt(0))) + Integer.parseInt(getNumber(str));
                } else{
                    key = String.valueOf(str.charAt(0));
                    value = Integer.valueOf(getNumber(str));
                }
            } else {
                key = str;
                value = 1;
            }
            hashMap.put(key, value);
        }
        return hashMap;
    }

    private String getNumber(String s) {
        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);
        return m.replaceAll("").trim();
    }
}

