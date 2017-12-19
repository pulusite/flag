package tba;

import java.util.*;

/**
 * Created by zhangdong on 2017/8/16.
 */
public class TbaTest {
    public void testMap2List(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "AA");
        map.put("2", "BB");
        map.put("3", "CC");
        map.put("4", "DD");

        Collection<String> valueCollection = map.values();
        final int size = valueCollection.size();

        List<String> valueList = new ArrayList<String>(valueCollection);

        String[] valueArray = new String[size];
        map.values().toArray(valueArray);
        for (int i = 0; i < valueArray.length; i++) {
            System.out.println(valueArray[i]);
        }
    }
    public static void main(String[] args) {
        TbaTest tt = new TbaTest();
        tt.testMap2List();
        Long l = new Long(11);
        System.out.println(l.longValue()>10);

    }
}
