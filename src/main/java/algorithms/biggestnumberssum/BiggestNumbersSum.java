package algorithms.biggestnumberssum;

import java.util.Collections;
import java.util.List;

public class BiggestNumbersSum {

    public int maxTriplet(List<Integer> list){

        Collections.sort(list);
        int x = list.get(list.size() - 1);
        int y = list.get(list.size() - 2);
        int z = list.get(list.size() - 3);
        return x + y + z;

    }
}
