public class User extends Thread {
    public static volatile boolean isTumblerOn;
    private static final int ITER_COUNT = 4;
    private static final int SLEEP_TIME = 2000;

    @Override
    public void run() {
        for (int i = 0; i < ITER_COUNT; i++) {
            System.out.println("Тумблер включен");
            isTumblerOn = true;
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().interrupt();
    }
}
