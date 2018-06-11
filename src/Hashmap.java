import java.util.Hashtable;

public class Hashmap {
    public static void main(String[] args){
        Hashtable hashtable=new Hashtable();
        hashtable.put("100","aaa");
        hashtable.put("200","bbb");
        hashtable.put("300","ccc");
        System.out.println(hashtable.get("300").toString()+hashtable.get("200").toString()+hashtable.get("100").toString());
    }
}
