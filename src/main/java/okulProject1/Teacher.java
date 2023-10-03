package okulProject1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Teacher {
    static Map<String,String> ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");

    }


    public static void ogretmenMenu() {
        Scanner input =new Scanner(System.in);
        String select="";
        do {
            System.out.println("*******ADIGÜZEL KOLEJİ*******\n======ÖĞRETMEN MENÜ======");
            System.out.println(    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");
            select=input.nextLine();

            switch (select){
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "A":
                case "a":
                   Runner.anamenu();

                    break;
                case "Q":
                case "q":
                    Runner.finish();
                    break;

            }
        }while (!select.equalsIgnoreCase("q"));



    }

    private static void branstanOgretmenBulma() {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen aradığınız öğretmenin branşını giriniz");
        String brans =input.nextLine();

        System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", "TC NO", "İsim", "Soyisim", "D.Yılı", "Branş");
        Set<Map.Entry<String,String>> entryTeacherList =ogretmenlerMap.entrySet();

        for (Map.Entry<String,String> each  : entryTeacherList ) {
            String eachKey =each.getKey();
            String eachValue=each.getValue();

            String [] eachValueArr = eachValue.split(", ");

            if (brans.equalsIgnoreCase(eachValueArr[3])){
                System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

            }

        }


    }

    private static void soyisimdenOgretmenBulma() {
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen aradığınız öğretmenin soyismini giriniz");
        String soyIsim =input.nextLine();
        System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", "TC NO", "İsim", "Soyisim", "D.Yılı", "Branş");
        Set<Map.Entry<String,String>> entryTeacherList =ogretmenlerMap.entrySet();

        for (Map.Entry<String,String> each  : entryTeacherList ) {
            String eachKey =each.getKey();
            String eachValue=each.getValue();

            String [] eachValueArr = eachValue.split(", ");

            if (soyIsim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);

           }

        }



    }

    private static void ogretmenListesiYazdir() {
        System.out.println("*******ÖĞRETMEN LİSTESİ*******");
        //System.out.printf("%-12s %-5s  %-4s  %-5s  %-9s ","TC NO","İsim","Soyisim","D.Yılı","Branş\n");
        System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", "TC NO", "İsim", "Soyisim", "D.Yılı", "Branş");
        Set<Map.Entry<String,String>> entryTeacherList =ogretmenlerMap.entrySet();

        for (Map.Entry<String,String> each  : entryTeacherList ) {
            String eachKey =each.getKey();
            String eachValue=each.getValue();

           String [] eachValueArr = eachValue.split(", ");
            //System.out.printf("%-12s %-5s  %-4s  %-5s  %-9s \n",eachKey,eachValueArr[0],eachValueArr[1],eachValueArr[2],eachValueArr[3]);
            System.out.printf("%-15s %-10s  %-10s  %-10s  %-10s\n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);



        }




    }
}
