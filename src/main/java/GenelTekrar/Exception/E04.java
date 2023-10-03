package GenelTekrar.Exception;

public class E04 {
    public static void main(String[] args) {
        String [] str ={"J","a","v","a"};
        getElementFromArray(str,1);
        getElementFromArray(str,5);

    }
    public static void getElementFromArray(String[] s,int idx){


        try {
            String  el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.err.println(e.getCause());
        }




    }
}
