public class SmartKitchen {
    private CoffeeMaker brewMaster ;
    private DishWasher dishWasher ;
    private Refrigerator iceBox ;


    public SmartKitchen() {
        brewMaster = new CoffeeMaker() ;
        dishWasher = new DishWasher() ;
        iceBox = new Refrigerator() ;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void pourMilk(){
        System.out.println("Pouring milk in the refrigerator");
    }

    public void addWater(){
        System.out.println("Adding water to the coffee-maker");
    }

    public void loadDishWasher(){
        System.out.println("loading dish-washer");
    }



    public void setKitchenState(boolean coffeeFlag , boolean fridgeFlag , boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag) ;
        iceBox.setHasWorkToDo(fridgeFlag) ;
        dishWasher.setHasWorkToDo(dishWasherFlag) ;
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
