package seminar4.task2;

import java.util.HashMap;
import java.util.Map;

public class CountOfPeopleWithDesiredAge {
    public static void main(String[] args) {
        Map<String, Integer> data1 = new HashMap<>();
        data1.put("Sergey", 20);
        data1.put("Maxim", 22);
        data1.put("Oleg", 31);

        int count = getCount(data1, 30);
        System.out.println(count);
    }

    public static int getCount(Map<String, Integer> array, int age) {
        return (int) array.values().stream()
                .map(value -> value > age)
                .filter(Boolean::booleanValue)
                .count();
    }

}
