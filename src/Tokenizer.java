import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {

        String str = "This is String , split by StringTokenizer, created by Sheven";
        StringTokenizer st = new StringTokenizer(str);

        System.out.println("----- 通过空格分隔 ------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("----- 通过逗号分隔 ------");
        StringTokenizer st2 = new StringTokenizer(str, ",");

        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
}