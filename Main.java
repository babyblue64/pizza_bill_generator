public class Main {
    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.choseTakeAway();
        basePizza.getBill();

        DeluxPizza delux_pizza = new DeluxPizza(true);
        delux_pizza.addExtraCheese(); //this won't work
        delux_pizza.choseTakeAway();
        delux_pizza.getBill();
    }
}