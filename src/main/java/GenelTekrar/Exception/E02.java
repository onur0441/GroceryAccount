package GenelTekrar.Exception;

public class E02 {
    public static void main(String[] args) {
        String s ="1234a";
        toInteger(s) ;

    }
    public static void toInteger(String s){
        try {
            int a =Integer.valueOf(s);
            System.out.println(a+1);
        }catch (NumberFormatException e){
            System.out.println("You can not do to Integer as letter");
            System.out.println(e.getMessage());


        }

    }



}
