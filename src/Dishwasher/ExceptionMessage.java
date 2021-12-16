package Dishwasher;

public enum ExceptionMessage {

    STOPPED("Посудомойка уже не работает"),
    EMPTY("Посудомойка уже освобождена от чистой посуды"),
    FULL("Не осталось места для чистой посуды"),
    STARTED("Посудомойка уже работает!"),
    FULL_CLEAR_DISHES("Выгрузите посуду"),
    ADD_DISHES("Загрузите посуду");


    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
