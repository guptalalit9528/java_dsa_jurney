package java_dsa.sorting.time_check;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Input {
    Random rn = new Random();
    List<Integer> list = new ArrayList<>();

    public List<Integer> getList(int numbers) {
        list.clear();
        for (int i = 0; i < numbers ; i++) {
            list.add(rn.nextInt(0,1000));
        }
        return list;
    }
}
