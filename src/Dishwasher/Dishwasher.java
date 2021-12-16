package Dishwasher;

//    Создать класс Dishwasher, который моделирует работу посудомоечной машины. Вы можете:
//        a.  загружать посуду по одному элементу (нельзя, если машина запущена либо чистая посуда не выгружена);
//        загрузить посуду можно, если позволяет вместимость (задается в конструктуре и определяет макс кол-во загруженной посуды);
//        b.  достать всю посуду;
//        c.  запустить машину (нельзя, если машина пустая либо чистая посуда не выгружена, либо уже запущена);
//        d.  остановить работу машины (нельзя, если не запущена);
//        Добавьте эксепшены в программу для обработки некорректного пользования машинкой (например, нельзя добавить посуду,
//        если машина уже запущена) - используйте свои классы для эксепшенов.
//        В конструктуре входной параметр должен быть больше 0 - используйте стандартный эксепшн, подходящий по назначению.
//        К методам должны быть добавлены java docs с описанием метода, входных параметров, результата и возможных эксепшенов.

public class Dishwasher {

    final public int maxSize;
    int size = 0;
    private DishwasherState state = new DishwasherDisabled();

    Dishwasher(int maxSize) {
        if (maxSize <= 0)
            throw new RuntimeException("Невозможно создать посудомойку без места для посуды");
        this.maxSize = maxSize;
    }

    /**
     * запустить машину (нельзя, если машина пустая либо чистая посуда не выгружена, либо уже запущена);
     */
    void start() {
        state = state.start(this);
    }

    /**
     * остановить работу машины (нельзя, если не запущена);
     */
    void stop() {
        state = state.stop();
    }

    /**
     * достать всю посуду; можно только для состояния Finished
     */
    void getAllDishes() {
        state = state.getAllDishes();
    }

    /**
     * загружать посуду по одному элементу (нельзя, если машина запущена либо чистая посуда не выгружена);
     * загрузить посуду можно, если позволяет вместимость
     */
    void addDish() {
        state = state.addDish(this);
    }

    public static void main(String[] args) {

        Dishwasher realDishwasher = new Dishwasher(30);
        realDishwasher.addDish();
        realDishwasher.start();
        realDishwasher.stop();
        realDishwasher.getAllDishes();

        Dishwasher badDishwasher = new Dishwasher(10);
        badDishwasher.start();
    }

}
