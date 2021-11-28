import java.util.Date;

abstract class Note {

    private String author;
    private Date date;
    private String message;
    private MessageType messageType;
    private long noteSize;

    Note() {}

    Note(String author, Date date, String message, MessageType messageType, long noteSize) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
        this.noteSize = noteSize;
    }

    void showContent(Note note) {
        System.out.println(note.toString());
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    abstract long getNoteSize();

    @Override
    public String toString() {
        return "Author: " + author + ", \n"
                + "Date: " + date + ", \n"
                + "Message: " + message + ", \n"
                + "MessageType: " + messageType.name() + ", \n"
                + "Size: " + noteSize;
    }

}
