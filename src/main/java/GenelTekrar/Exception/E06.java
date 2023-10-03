package GenelTekrar.Exception;

public class E06 {
    public static void main(String[] args) {
        printAge(63);
        printAge(-5);




    }

    public static void printAge(int age){
        if (age<0){
           throw new  IllegalArgumentException ("Age cannot be negative");
        }else {
            System.out.println(age);
        }


    }
}
