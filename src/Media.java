import java.util.Date;

abstract class Media extends Note {

    String extension;

    Media(String author, Date date, String message, MessageType messageType, long noteSize, String extension) {
        super(author, date, message, messageType, noteSize);
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    void showContent() {
        super.showContent();
        System.out.println(extension);
    }

}
