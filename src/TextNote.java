import java.util.Date;

public class TextNote extends Note implements Printable {

    String title;

    TextNote(String author, Date date, String message, MessageType messageType, long noteSize, String title) {
        super(author, date, message, messageType, noteSize);
        this.title = title;
    }

    @Override
    long getNoteSize() {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.println(title);
    }

    @Override
    public void print() {
        showContent();
    }
}
