package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> arrayList1 = new ArrayList<>(collection1);
        for (List<String> stringList : collection2.values()) {
            ArrayList<String> arrayList2 = new ArrayList<>(stringList);
            arrayList1.retainAll(arrayList2);
        }
        return arrayList1;
    }
}
