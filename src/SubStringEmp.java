public class SubStringEmp {
    public static void main(String args[]){
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos){
        System.out.println(s.substring(0, pos));
        System.out.println(s.substring( pos));
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
