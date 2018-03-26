package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> arrayList1 = new ArrayList<>(collection1);
        ArrayList<String> arrayList2 = new ArrayList<>(collection2.get(0));
        arrayList1.retainAll(arrayList2);
        return arrayList1;
    }
}
