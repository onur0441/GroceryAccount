package smallstudygrouplessonsdowhileloop;

import java.util.Scanner;

public class DoWhileLoopQuestion1 {
    public static void main(String[] args) {
        //girilen tamsayinin basamaklarinin toplamini yazan program
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi =input.nextInt();
        int sum =0;
        do {
           sayi = Math.abs(sayi);
            sum=sum+sayi%10;
            sayi=sayi/10;

        }while (sayi>0);
        System.out.println("sum = " + sum);


    }
}
