public class Main {

    public static void main(String[] args) throws InterruptedException {
        User user = new User();
        Toy toy = new Toy();
        user.start();
        toy.start();
        user.join();
        toy.interrupt();
    }
}
