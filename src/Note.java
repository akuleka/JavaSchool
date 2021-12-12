import java.util.Date;

abstract class Note {

    private final String author;
    private final Date date;
    private final String message;
    private final MessageType messageType;
    private final long noteSize;

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

    void showContent() {
        System.out.println(author);
        System.out.println(date);
        System.out.println(message);
        System.out.println(messageType);
        System.out.println(noteSize);
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
