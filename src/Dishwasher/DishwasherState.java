package Dishwasher;

interface DishwasherState {

    DishwasherState start(Dishwasher dishwasher);
    DishwasherState stop();
    DishwasherState getAllDishes();
    DishwasherState addDish(Dishwasher dishwasher);
}
