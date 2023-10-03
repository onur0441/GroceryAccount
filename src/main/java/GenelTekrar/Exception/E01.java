package GenelTekrar.Exception;

public class E01 {
    public static void main(String[] args) {
        divide(8,0);



    }

    public static void divide(int a, int b){


        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Number that you gave can not divide to zero");

        }

    }
}
