package cn.school.thoughtworks.section1;
import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        ArrayList<String> arrayList = new ArrayList<>(collection1);
        ArrayList<String> arrayList1 = new ArrayList<>(collection2);
        arrayList.retainAll(arrayList1);
        return arrayList;
    }

}
