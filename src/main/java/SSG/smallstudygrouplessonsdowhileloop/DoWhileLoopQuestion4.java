package SSG.smallstudygrouplessonsdowhileloop;

public class DoWhileLoopQuestion4 {
    public static void main(String[] args) {
        //üslü sayilari bulabilen java kodu yaziniz
        int taban =2;
        int us =8;
        int sonuc =1;
          int i = 1;
        do {
            sonuc*=taban;
            i++;

        }while (i<=us);
        System.out.println(sonuc);


    }

}
