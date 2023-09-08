package smallstudygrouplessonsdowhileloop;

public class DoWhileLoopQuestion2 {
    public static void main(String[] args) {
        //bir tamsayinin tam bölenlerini ve tam bölenlerinin toplamini bulunuz
        int sayi =45;
        int bolen =1;
        int toplam =0;
        int counter=0;
        do {
            if (sayi % bolen ==0){
                System.out.println(sayi+" sayisi "+bolen+" sayisina tam bölünür");
                toplam+=bolen;
                counter++;

            }
            bolen++;

        }while (bolen<=sayi);
        System.out.println("tam bölenlerinin toplami = "+toplam);
        System.out.println("tam bölenlerinin sayisi = "+counter);

    }
}
