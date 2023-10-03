package GenelTekrar.Exception;

public class E05 {
    public static void main(String[] args) {
        int a =12;
        int b =1;
        String str ="Java";
        getCharFromString(str,a,b);


    }
    public static void getCharFromString(String s ,int a,int b){
       try {
           int idx =a/b;
           char ch =s.charAt(idx);
           System.out.println(ch);
       }catch (ArithmeticException e){
           System.out.println("do not divide by zero");
           System.out.println(e.getMessage());
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("olmayan index kullanımı");
           System.err.println(e.getCause());

       }



    }
}
