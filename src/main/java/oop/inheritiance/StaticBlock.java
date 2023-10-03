package oop.inheritiance;

public class StaticBlock {
       static double pi ;



    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main block");






    }
    static {
        pi =3.14;
        System.out.println("static block1");
    }
}
