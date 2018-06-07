class Value {
    int i;
}

public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        Integer n3 = 47;
        System.out.println(n1 == n2);  //2个对象的地址不同，false
        System.out.println(n1.equals(n2));   //2个对象本身所表示的值相等，true

        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));  //v1和v2是不同的对象，只是两个对象的i值相等，对象本身当然不相等，地址也不相同，false
        System.out.println(v1.i==v2.i);  //v1的i值等于v2的i值，值的地址相同，都指向100的堆，true
    }
}
