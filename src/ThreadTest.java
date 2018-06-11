public class ThreadTest extends Thread {
    String name;

    public ThreadTest(String s) {
        name = s;
    }

    public static void main(String[] args) {
        ThreadTest thread1 = new ThreadTest("xxx");
        ThreadTest thread2 = new ThreadTest("yyy");
        thread1.start();
        thread2.start();
    }

    public void run() {
        System.out.print(name);
    }
}
