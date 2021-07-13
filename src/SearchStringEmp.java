public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Sheven Limter Lim";
        int intIndex = strOrig.indexOf("Lim");
        if (intIndex == -1) {
            System.out.println("not found");
        }else{
            System.out.println("position at : " + intIndex);
        }
    }
}
