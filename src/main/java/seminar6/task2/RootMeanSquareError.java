package seminar6.task2;

import java.util.List;

public class RootMeanSquareError {
    public static double MSE(List<Integer> X, List<Integer> Y) {
        int n = X.size();

        if (n != Y.size()){
            System.out.println("Для получения среднеквадратичной ошибки, массивы должны быть одинаковы");
            return 0;
        }


        double[] sqrtSubXY = new double[n];
        double sumXY = 0;

        for (int i = 0; i < n; i++) {
            sqrtSubXY[i] = Y.get(i) - X.get(i);
            sumXY += sqrtSubXY[i] * sqrtSubXY[i];
        }

        double MSE = sumXY / n;
        return MSE;
    }

    public static void main(String[] args) {
        List<Integer> x = List.of(1, 2, 3, 4, 5, 7);
        List<Integer> y = List.of(5, 4, 3, 2, 1);

        double result = MSE(x, y);
        System.out.println("Среднеквадратичная ошибка: " + result);
    }
}
