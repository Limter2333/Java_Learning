import java.sql.SQLOutput;
import java.util.Locale;

public class StringToUpperCaseEmp {
    public static void main(String[] args){
        String str = "Hello World!";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串: " + str);
        System.out.println("转为大写: " + strUpper);
    }
}
