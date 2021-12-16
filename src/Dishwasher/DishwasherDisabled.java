package Dishwasher;

public class DishwasherDisabled implements DishwasherState {

    @Override
    public DishwasherState start(Dishwasher dishwasher) {
        if (dishwasher.size == 0)
            throw new DishwasherException(ExceptionMessage.ADD_DISHES.getMessage());
        return new DishwasherEnabled();
    }

    @Override
    public DishwasherState stop() {
        throw new DishwasherException(ExceptionMessage.STOPPED.getMessage());
    }

    @Override
    public DishwasherState getAllDishes() {
        throw new DishwasherException(ExceptionMessage.EMPTY.getMessage());
    }

    @Override
    public DishwasherState addDish(Dishwasher dishwasher) {
        if (dishwasher.size < dishwasher.maxSize)
            dishwasher.size++;
        else throw new DishwasherException(ExceptionMessage.FULL.getMessage());
        return this;
    }
}
