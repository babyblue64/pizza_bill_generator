public class Pizza {
    private int currentPrice;
    private boolean veg;
    private int basePrice;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int carryBagPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeaway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.currentPrice = 300;
        } else {
            this.currentPrice = 400;
        }
        this.basePrice = currentPrice;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.currentPrice += extraCheesePrice;
        // System.out.println("Extra cheese added!");
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.currentPrice += extraToppingsPrice;
        // System.out.println("Extra toppings added!");
    }

    public void choseTakeAway() {
        isOptedForTakeaway = true;
        this.currentPrice += carryBagPrice;
        // System.out.println("Opted for Takeaway!");
    }

    public void getBill() {
        String bill = "Pizza: " + this.basePrice + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra cheese: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra toppings: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeaway) {
            bill += "Carry bag: " + carryBagPrice + "\n";
        }
        bill += "Total price: " + this.currentPrice;
        System.out.println(bill);
    }
}
