import java.util.Date;

public class Picture extends Media {

    int wight;
    int height;

    Picture(String author, Date date, String message, MessageType messageType, long noteSize, int wight, int height, String extension) {
        super(author, date, message, messageType, noteSize, extension);
        this.wight = wight;
        this.height = height;
    }

    @Override
    long getNoteSize() {
        return 0;
    }

    public int getWight() {
        return wight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.println(height);
        System.out.println(wight);
    }

}
