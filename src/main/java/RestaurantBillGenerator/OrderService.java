package RestaurantBillGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner input =new Scanner(System.in);


    public List<Order> orderList =new ArrayList<>();

    public void createOrder(DishService dishService){
        int dishcode;
       do {
           System.out.println("Lütfen ürün kodunu giriniz(Çıkış için 0!");
           dishcode =input.nextInt();
         Dish dish =  dishService.findDishByCode(dishcode);
         if (dish!=null){
             System.out.println("Adet giriniz");
             int number =input.nextInt();
            Order order= findOrderByDish(dish);
            if (order!=null){
                order.setNumberOfDish(order.getNumberOfDish()+number);
                order.setOrderPrice();
            }else {
                order=new Order(dish,number);
                order.setOrderPrice();
                this.orderList.add(order);
            }


         }




       }while (dishcode!=0);


    }

    public Order findOrderByDish(Dish dish){
        for (Order w:this.orderList ) {
            if (w.getDish().equals(dish)){
                return w;
            }

        }
        return null;

    }




}
