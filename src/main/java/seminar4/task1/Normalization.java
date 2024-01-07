package seminar4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Normalization {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.0, 2.0, 3.0, 6.0);

        System.out.println(normalizationArray(list));

    }

    public static List<Double> normalizationArray(List<Double> array) {
        double min = Collections.min(array);
        double max = Collections.max(array);
        List<Double> result = new ArrayList<>();

        for (Double i: array) {
            result.add(normalizationSingleNum(min, max, i));
        }

        return result;
    }


    public static double normalizationSingleNum(double min, double max, double num) {
        return (num - min) / (max - min);
    }
}
