package oop.inheritiance;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdName);

        Student aliYas =new Student();
        System.out.println(aliYas.age);

        Student.staticMethod();
        Student nStatic =new Student();
        nStatic.nonStaticMethod();




    }
}
