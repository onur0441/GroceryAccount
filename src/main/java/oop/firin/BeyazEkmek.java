package oop.firin;

public abstract class BeyazEkmek implements Ekmek {

    @Override
    public void un() {
        System.out.println("Beyaz ekmekler %59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmekler %38 un içerir");

    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmekler %1.5 maya içerir");

    }

    public abstract void sekil();




}
