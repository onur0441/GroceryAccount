package GenelTekrar.Exception;

public class E03 {
    public static void main(String[] args) {
        String str ="Java";
        charTake(str,2);
        charTake(str,4);

    }

    public static void charTake(String s ,int idx){


        try {
            char    ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getCause());
            System.err.println("you can not get out the bound");
            e.printStackTrace();

        }



    }
}
