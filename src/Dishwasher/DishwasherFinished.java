package Dishwasher;

public class DishwasherFinished implements DishwasherState {

    @Override
    public DishwasherState start(Dishwasher dishwasher) {
        throw new DishwasherException(ExceptionMessage.FULL_CLEAR_DISHES.getMessage());
    }

    @Override
    public DishwasherState stop() {
        throw new DishwasherException(ExceptionMessage.FULL_CLEAR_DISHES.getMessage());
    }

    @Override
    public DishwasherState getAllDishes() {
        return new DishwasherDisabled();
    }

    @Override
    public DishwasherState addDish(Dishwasher dishwasher) {
        throw new DishwasherException(ExceptionMessage.FULL_CLEAR_DISHES.getMessage());
    }
}
