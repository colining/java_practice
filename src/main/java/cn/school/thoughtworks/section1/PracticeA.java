package cn.school.thoughtworks.section1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> list1 = collection1.stream().filter(collection2::contains).collect(Collectors.toList());
        return list1;
    }

}
