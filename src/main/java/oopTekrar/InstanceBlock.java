package oopTekrar;

public class InstanceBlock {

    public int year;

    public InstanceBlock() {

    }

    public InstanceBlock(int year) {

        this.year = year;
    }

    {
        System.out.println("hi");

    }
}
