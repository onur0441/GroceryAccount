package RestaurantBillGenerator;

import java.util.ArrayList;
import java.util.List;

public class DishService {

    private      List<Dish> dishList =new ArrayList<>();
    public DishService (){
        fillDishList();

    }

    private void fillDishList() {
        Dish dish1=new Dish(100,"Adana Kebabı",250.99);
        Dish dish2=new Dish(101,"Urfa Kebabı",200.0);
        Dish dish3=new Dish(102,"Çökertme Kebabı",200.0);
        Dish dish4=new Dish(200,"Baklava",100.0);
        Dish dish5=new Dish(201,"Kadayıf",85.0);
        Dish dish6=new Dish(202,"Künefe",75.0);
        Dish dish7=new Dish(300,"Yayık Ayranı",30.0);
        Dish dish8=new Dish(301,"Kola",35.0);
        Dish dish9=new Dish(302,"Çay",15.0);
        Dish dish10=new Dish(303,"Su",7.5);
        this.dishList.add(dish1);
        this.dishList.add(dish2);
        this.dishList.add(dish3);
        this.dishList.add(dish4);
        this.dishList.add(dish5);
        this.dishList.add(dish6);
        this.dishList.add(dish7);
        this.dishList.add(dish8);
        this.dishList.add(dish9);
        this.dishList.add(dish10);
    }


    public void showMenu(){
        System.out.println("                         ***LEZZETLERİMİZ***");
        System.out.printf("%-3s      %-20s     %-6s      \n","Kod","Adı","Fiyat");
        System.out.printf("%-3s      %-20s     %-6s      \n","***","****","******");

        for (Dish w:dishList ) {
            System.out.printf("%-3s      %-20s     %-6s      \n",w.getCode(),w.getName(),w.getPrice());

        }
    }

    public Dish findDishByCode(int code){
        if (code == 0){
            System.out.println("Ana menüye yönlendiriliyorsunuz");
        }else {
            for (Dish w : dishList) {
                if (w.getCode() ==code){
                    return w;
                }

            }
            System.out.println("Ürün bulunamadı");
        }
           return null;
    }


}
