package Chapter4.factoryMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("내가 주문한 : " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("홍길동이 주문한 : " + pizza.getName() + "\n");

    }
}
