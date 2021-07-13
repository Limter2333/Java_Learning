public class StringReverseExample{
    public static void main(String[] args){
        String string="big jb";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串反转前:"+string);
        System.out.println("字符串反转后:"+reverse);
    }
}