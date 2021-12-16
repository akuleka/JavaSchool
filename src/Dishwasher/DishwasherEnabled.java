package Dishwasher;

public class DishwasherEnabled implements DishwasherState {

    @Override
    public DishwasherState start(Dishwasher dishwasher) {
        throw new DishwasherException(ExceptionMessage.STARTED.getMessage());
    }

    @Override
    public DishwasherState stop() {
        return new DishwasherFinished();
    }

    @Override
    public DishwasherState getAllDishes() {
        throw new DishwasherException(ExceptionMessage.STARTED.getMessage());
    }

    @Override
    public DishwasherState addDish(Dishwasher dishwasher) {
        throw new DishwasherException(ExceptionMessage.STARTED.getMessage());
    }
}
