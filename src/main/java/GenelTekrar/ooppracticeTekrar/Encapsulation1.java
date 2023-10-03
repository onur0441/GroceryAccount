package GenelTekrar.ooppracticeTekrar;

public class Encapsulation1 {
    public static void main(String[] args) {
        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        Encapsulation obj=new Encapsulation("Ali","Can",-25);
        System.out.println(obj.getIsim());
        System.out.println(obj.getYas());
        System.out.println(obj.getSoyisim());
        System.out.println(obj.toString());
        //objenin yasını 30 olarak guncelleyin
        obj.setYas(30);
        System.out.println(obj.getYas());
        //parametresiz cons kullanarak 2. bir obje olusturun
        Encapsulation obj2=new Encapsulation();
        System.out.println(obj2);
        obj2.setIsim("Ayşe");
        obj2.setSoyisim("Yılmaz");
        obj2.setYas(40);
        System.out.println(obj2);
        System.out.println(obj.getYas());
        System.out.println(obj2.getYas());
        //yas ı -5 olarak guncelleyin
        obj2.setYas(-5);
        System.out.println(obj2.getYas());



    }

}
