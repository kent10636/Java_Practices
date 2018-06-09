public class Index {
    public static void main(String[] args) {
        String s = "xxxxxxxxxxxxxxx#123#456#zzzzz";
        int n = s.indexOf("#");
        int k = s.indexOf("#", n + 1);
        String s2 = s.substring(n + 1, k);
        System.out.println(n);
        System.out.println(k);
        System.out.println(s2);
    }
}
