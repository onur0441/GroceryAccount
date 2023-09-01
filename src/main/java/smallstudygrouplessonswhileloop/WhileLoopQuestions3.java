package smallstudygrouplessonswhileloop;

import java.util.Scanner;

public class WhileLoopQuestions3 {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner input =new Scanner(System.in);
        int sum =0;
        int numbers;


        while (sum<=500){

            System.out.println("You can enter as many numbers as you want, but the sum of these numbers should not exceed 500.");
             numbers = input.nextInt();

            if (numbers>0){
                sum+=numbers;


            }else System.out.println("please enter pozitive integer");

        }
        System.out.println("That is enough,you entered a lot of numbers.Sum = "+sum);





    }
}
