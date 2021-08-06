public class Toy extends Thread {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (User.isTumblerOn) {
                System.out.println("***Тумблер выключен***");
                User.isTumblerOn = false;
            }
        }
    }
}
