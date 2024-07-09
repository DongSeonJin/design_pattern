package Chapter4;


public class Main {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");


    }
}