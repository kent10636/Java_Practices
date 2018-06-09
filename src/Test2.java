package Test2;

public class Test2 {
    public static void main(String[] args) {
        Object a1 = new A();
        Object a2 = new A();

        A a3 = new A();
        A a4 = new A();

        String s1 = "Hello!";
        String s2 = "Hello!";

        System.out.println(a1.equals(a2));  //false
        System.out.println(a3.equals(a4));  //true
        System.out.println(s1.equals(s2));  //true
    }
}

class A {
    int x;

    public boolean equals(A a) {
        return this.x == a.x;
    }
}
