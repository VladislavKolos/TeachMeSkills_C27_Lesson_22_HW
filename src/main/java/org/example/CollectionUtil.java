package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil {
    public static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static boolean containsNumber(List<Integer> numbers, int target) {
        return numbers.contains(target);
    }
}
