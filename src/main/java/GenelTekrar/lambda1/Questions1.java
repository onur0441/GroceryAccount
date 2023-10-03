package GenelTekrar.lambda1;

import java.util.*;

public class Questions1 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));
        printEvenElement(nums);
        System.out.println();
        printSquareOfElement(nums);
        System.out.println();
        printCubeOfOddElement(nums);
        System.out.println();
        printSumOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMaxValue4(nums);
        System.out.println();
        getMinValue1(nums);
        System.out.println();
        getMinValue2(nums);
        System.out.println();
        getMinValue3(nums);
        System.out.println();
        getMinValue4(nums);
        System.out.println();
        getMinGreaterThanSevenEven(nums);
        getMinGreaterThanSevenEven2(nums);
        System.out.println();



    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(functional)
    public static void printEvenElement(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }

    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printSquareOfElement(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfOddElement(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));
    }
    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin"
    // "toplamını" hesaplayan method oluşturun
    public static void printSumOfSquareOfDistinctEvenElements(List<Integer> nums){
       int sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
    ////5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){
      int multiply =  nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)-> t*u);
        System.out.println(multiply);

    }
    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1. yol
    public static void getMaxValue1(List<Integer> nums){
       int max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t :u );
        System.out.println(max);

    }
    //2. yol
    public static void getMaxValue2(List<Integer> nums){
        int max = nums.stream().distinct().reduce(nums.get(0),(t,u)-> t>u ? t :u );
        System.out.println(max);

    }
    //3. yol
    public static void getMaxValue3(List<Integer> nums){
      Integer max = nums.stream().distinct().sorted().reduce((t, u)->u).get();

        System.out.println(max);

    }
    public static void getMaxValue4(List<Integer> nums){
              Integer max =  nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }
    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun
    //1.yol

    public static void getMinValue1(List<Integer> nums){
       int min = nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ?t :u );
        System.out.println(min);

    }
    public static void getMinValue2(List<Integer> nums){
        int min = nums.stream().distinct().reduce(nums.get(0),(t,u)->t<u ?t :u );
        System.out.println(min);

    }
    public static void getMinValue3(List<Integer> nums){
       Integer min =nums.stream().distinct().sorted().reduce((t,u)->t).get();
        System.out.println(min);

    }
    public static void getMinValue4(List<Integer> nums){

      Integer min =   nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> nums){
       Integer min = nums.stream().distinct().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println(min);

    }
    public static void getMinGreaterThanSevenEven2(List<Integer> nums){
        Integer min = nums.
                stream().distinct().
                filter(t->t>7 && t%2==0).
                sorted().
               findFirst().
                get();
        System.out.println(min);

    }



}