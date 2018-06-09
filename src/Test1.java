package Test1;

public class Test1 {
    public static void main(String[] args) {
        B b = new B();
        b.m(5);  //调用的是父类A的m方法，接收参数为int
        b.m(23.0);  //调用的是子类A的m方法，接收参数为double
        System.out.println("d is " + b.d);
    }
}

class A {
    protected int i;

    public void m(int i) {
        this.i = i;
    }
}

class B extends A {
    double d;  //简单类型的类成员变量自动默认赋值，此处为0.0

    public void m(double d) {
        this.d += d + i;
    }
}
