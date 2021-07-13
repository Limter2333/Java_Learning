public class StringReplaceEmp {
    public static void main(String[] args){
        String str = "Hello World!";
        System.out.println( str.replace('H','W'));
        System.out.println(str.replaceFirst("He","Wo"));
        System.out.println(str.replaceAll("l","g"));
    }
}
