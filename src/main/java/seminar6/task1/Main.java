package seminar6.task1;

import seminar6.task1.model.Stopwatch;
import seminar6.task1.view.ConsoleView;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        ConsoleView consoleView = new ConsoleView(stopwatch);
        consoleView.run();
    }
}
