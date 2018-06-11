public class Test6 {
    public static void main(String[] args) {
        Test6 a = new Test6();
        a.method(8);
        a.method(8f);
    }

    void method(double i) {
        System.out.println("double:" + i);
    }

    void method(int i) {
        System.out.println("int:" + i);
    }
}
