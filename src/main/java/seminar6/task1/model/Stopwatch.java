package seminar6.task1.model;

public class Stopwatch {
    private long startTime;
    private long pausedTime;
    private boolean isRunning;

    public void Stopwatch() {
        isRunning = false;
    }

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Секундомер запущен.");
        } else {
            System.out.println("Секундомер уже работает.");
        }
    }

    public void pause() {
        if (isRunning) {
            pausedTime = System.currentTimeMillis() - startTime;
            isRunning = false;
            System.out.println("Секундомер приостановлен.");
        } else {
            System.out.println("Секундомер уже на паузе.");
        }
    }

    public void resume() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - pausedTime;
            isRunning = true;
            System.out.println("Секундомер возобновлен.");
        } else {
            System.out.println("Секундомер уже работает.");
        }
    }

    public void reset() {
        isRunning = false;
        System.out.println("Секундомер сброшен.");
    }

    public void exit() {
        isRunning = false;
        System.out.println("Выход из программы.");
        System.exit(0);
    }
}
