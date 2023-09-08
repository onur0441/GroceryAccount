package GenelTekrar;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        //kullanıcıya sayı girmesini söyleyin.
        //kullanıcı sıfır girdiğine ekrana o ana kadar girmiş olduğu tüm sayıların toplamını yazdırınız.
        //örneğin; 5,4,7,0 ise 5+4+7=16 olduğunda ekrana 16 yazdırın
        Scanner input =new Scanner(System.in);
        int sum =0;
        int number ;
        int i=1;
        do {
            System.out.println("please enter one integer");
            number =input.nextInt();
            sum+=number;
            if (number ==0) break;

            i++;
        }while (true);
        System.out.println(sum);



    }
}
