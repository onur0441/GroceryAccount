package okulProject1;

public class School {
    public static   final String schoolName ="Adıgüzel Koleji";
    public static   final String address ="Gebze / KOCAELİ";

    public static final String telNo ="0262 754 5480";

    public static void okulBilgileriniGoruntule() {
        System.out.println(schoolName+"\n"+address+"\n"+telNo);
    }

    private School() {
    }
}
