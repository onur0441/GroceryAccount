package GenelTekrar.practiceoop;

public class Child extends Parent {

    int yas = 10;

    public static void main(String[] args) {
        Parent.method1();
        method1();
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim ="veli";
        System.out.println("isim = " + isim);

        Parent obj1 =new Parent();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);

        Child obj2 =new Child();
        obj2.method3();
        obj2.method4();
        System.out.println("obj2.yas = " + obj2.yas);


    }


}
