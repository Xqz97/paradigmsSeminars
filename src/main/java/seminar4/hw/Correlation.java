package seminar4.hw;

import java.util.List;

public class Correlation {
        public static double mean(List<Integer> numbers) {
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum / numbers.size();
        }

        public static double correlation(List<Integer> x, List<Integer> y) {
            int n = x.size();
            double meanX = mean(x);
            double meanY = mean(y);

            double[] diffX = new double[n];
            double[] diffY = new double[n];
            double sumXY = 0;
            double sumXSquared = 0;
            double sumYSquared = 0;

            for (int i = 0; i < n; i++) {
                diffX[i] = x.get(i) - meanX;
                diffY[i] = y.get(i) - meanY;
                sumXY += diffX[i] * diffY[i];
                sumXSquared += diffX[i] * diffX[i];
                sumYSquared += diffY[i] * diffY[i];
            }

            double correlation = sumXY / Math.sqrt(sumXSquared * sumYSquared);
            return correlation;
        }

        public static void main(String[] args) {
            List<Integer> x = List.of(1, 2, 3, 4, 5);
            List<Integer> y = List.of(5, 4, 3, 2, 1);

            double result = correlation(x, y);
            System.out.println("Коэффициент корреляции: " + result);
        }
    }

