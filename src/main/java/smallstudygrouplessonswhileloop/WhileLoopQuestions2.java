package smallstudygrouplessonswhileloop;

import java.util.Scanner;

public class WhileLoopQuestions2 {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir tamsayi alip
        //  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner input =new Scanner(System.in);
        System.out.println("please enter a pozitive integer");
           int number =input.nextInt();
           if (number<1){
               System.out.println("you have to enter pozitive integer");
           }
           int i =1;
           while (i<=number){
               System.out.print(i+" ");
               i++;
           }

    }
}
