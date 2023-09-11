package SSG.smallstudygrouplessonswhileloop;

import java.util.Scanner;

public class WhileLoopQuestions4 {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner input =new Scanner(System.in);
        int sum =0;

        while (true){
            System.out.println("lütfen toplabacak sayilar giriniz");
            int number =input.nextInt();
            sum =sum+number;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Toplam = "+sum);





    }
}
