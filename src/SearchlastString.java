public class SearchlastString {
    public static void main(String[] args){
        String strOrig = "Hello World, Hello, World!";
        int lastIndex = strOrig.lastIndexOf("World");
        if(lastIndex == -1){
            System.out.println("World not found");
        }else {
            System.out.println("last position at :" + lastIndex);
        }
    }
}
