package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean cheese = false;
    private Boolean topping = false;
    private Boolean bag = false;
    private Boolean billCreated = false;
    private String bill= "";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg) price += 300;
        else price += 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese == false) price += 80;
        cheese = true;
    }

    public void addExtraToppings(){
        if(topping == false){
            if(isVeg) price += 70;
            else price += 120;
        }
        topping = true;
    }

    public void addTakeaway(){
        if(bag == false)  price += 20;
        bag = true;
    }

    public String getBill(){

      if(billCreated == false) {
          if (isVeg) bill += "Base Price Of The Pizza: " + 300 + "\n";
          else bill += "Base Price Of The Pizza: " + 400 + "\n";

          if (cheese) bill += "Extra Cheese Added: " + 80 + "\n";

          if (topping == true && isVeg == true) bill += "Extra Toppings Added: " + 70 + "\n";
          else if (topping == true && isVeg == false) bill += "Extra Toppings Added: " + 120 + "\n";

          if (bag) bill += "Paperbag Added: " + 20 + "\n";

          bill += "Total Price: " + price + "\n";

          billCreated = true;
      }
        return this.bill;
    }
}
