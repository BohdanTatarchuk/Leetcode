package org.example.Easy;

import java.util.Collection;
import java.util.HashMap;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean result = true;

        for (int number : arr) {
            if (map.containsKey(number)) {
                int temp = map.get(number);
                map.replace(number, temp + 1);
            } else {
                map.put(number, 1);
            }
        }

        Collection<Integer> coll = map.values();
        Integer[] occurancy = coll.toArray(new Integer[coll.size()]);

        for (int j = 0; j < occurancy.length; j++) {
            for (int a = j + 1; a < occurancy.length; a++) {
                if (occurancy[j].equals(occurancy[a])) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
